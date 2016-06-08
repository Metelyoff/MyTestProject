package com.metelyoff.webserver;

//import com.sun.deploy.net.HttpRequest;
//import com.sun.deploy.net.HttpUtils;
//import sun.nio.cs.US_ASCII;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(81);
        while(true){
            System.out.println("------------------------");
            System.out.println("Waiting for TCP-connection...");
            Socket socket=serverSocket.accept();
            System.out.println("Get one!");
            System.out.println("Local port: "+serverSocket.getLocalPort());
            System.out.println("Local address: "+serverSocket.getLocalSocketAddress());
            System.out.println("Channel: "+serverSocket.getChannel());
            System.out.println("Buffer Size: "+serverSocket.getReceiveBufferSize());
            System.out.println("Timout: "+serverSocket.getSoTimeout());
            System.out.println("toString:");
            System.out.print(serverSocket.toString());
            System.out.println("------------------------");
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
//            byte[] request = HttpUtils.readRequestFully(in);

//            System.out.println(new String(request));

            String ln = null;
            try {
                while ((ln = reader.readLine()) != null) {
                    writer.write(ln + "\n");
                    writer.flush();
                }
            } catch (IOException e) {
                System.out.println("Exception read.");
                System.exit(-1);
            }
//            byte[] response = new String("Hi everyone!").getBytes(); //convert in case to put to byte[]
//            out.write(response);
        }
    }
}
