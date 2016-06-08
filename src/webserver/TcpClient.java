package webserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * * ������������ � ������� � �������� ��� ��������� �������� ������������� � *
 * �������. ���� ������� ���������� ������ ����������, ���� ������. ��� *
 * ���������� ���������� � �������� ������ ����� ����������� localhost:9999
 */
public class TcpClient {
	public static void main(String[] args) {
		/* ���������� ���� ������� � ���� */ String host = DEFAULT_HOST;
		int port = DEFAULT_PORT;
		if (args.length > 0) {
			host = args[0];
		}
		if (args.length > 1) {
			port = Integer.parseInt(args[1]);
		}
		/* * ������� ����� ��� ���������� ���� ����/���� */ Socket socket = null;
		try {
			socket = new Socket(host, port);
		} catch (UnknownHostException e) {
			System.out.println("����������� ����: " + host);
			System.exit(-1);
		} catch (IOException e) {
			System.out.println("������ �����/������ ��� �������� ������ " + host + ":" + port);
			System.exit(-1);
		}
		/* * ��� �������� ������� ����������� ����� ����� � BufferedReader */ BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		/*
		 * * �������� ����� ������, ����� ������� ����� ������������ ��������� *
		 * �������
		 */ OutputStream out = null;
		try {
			out = socket.getOutputStream();
		} catch (IOException e) {
			System.out.println("�� ������� �������� ����� ������.");
			System.exit(-1);
		}
		/*
		 * * ��� �������� ������������� ��������� ����� ������������� � �����
		 * ������ * ���������� ������
		 */ BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		String ln = null;
		try {
			while ((ln = reader.readLine()) != null) {
				writer.write(ln + "\n");
				writer.flush();
			}
		} catch (IOException e) {
			System.out.println("������ ��� ������ ���������.");
			System.exit(-1);
		}
	}

	private static final String DEFAULT_HOST = "localhost";
	private static final int DEFAULT_PORT = 9999;
}