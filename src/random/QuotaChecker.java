package random;

import java.io.IOException;
import java.util.ArrayList;

public class QuotaChecker {
	private final String QUOTA_QUERY = "http://random.org/quota/?format=plain";
	private final String QUOTA_QUERY_IP = "&ip=";

	/**
	 * Retrieves current remaining quota for requester IP
	 * 
	 * @return value in bits
	 * @throws IOException
	 */
	public long quota() throws IOException {
		ArrayList<String> strings = HttpWork.get(QUOTA_QUERY);
		return Long.parseLong(strings.get(0));
	}

	/**
	 * Retrieves current remaining quota for specified IP
	 * 
	 * @param
	 * @return value in bits
	 * @throws IOException
	 */
	public long quota(String ip) throws IOException {
		ArrayList<String> strings = HttpWork.get(QUOTA_QUERY + QUOTA_QUERY_IP + ip);
		return Long.parseLong(strings.get(0));
	}
}
