package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public final class HttpWork {

	private static final String GET = "GET";

	private HttpWork() {
	}

	/**
	 * Retrieves content on provided url. Recreates connection on eeach call.
	 * 
	 * @param url
	 * @return BufferedReader
	 * @throws IOException
	 */
	public static ArrayList<String> get(String urlString) throws IOException {
		// TODO handle 503 response
		// TODO add timeout functionality
		HttpURLConnection connection;
		BufferedReader rd = null;
		ArrayList<String> strings = new ArrayList<String>();
		try {
			URL url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(GET);
			rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				strings.add(line);
			}
		} finally {
			if (rd != null) {
				rd.close();
			}
		}
		return strings;
	}
}
