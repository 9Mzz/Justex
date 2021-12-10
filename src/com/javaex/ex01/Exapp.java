package com.javaex.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Exapp {
	public static void main(String[] args) throws IOException {
////////////////////////////////////////////////////////s]

		ServerSocket serversocket = new ServerSocket();
		serversocket.bind(new InetSocketAddress("172.30.1.48", 10001));

		System.out.println("서버연결");
		Socket socket = serversocket.accept();
		System.out.println("연결됨.");
		
		
////////////////////////////////////////////////////////
	}
}
