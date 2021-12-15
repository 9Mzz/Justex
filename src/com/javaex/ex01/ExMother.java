package com.javaex.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import echo.ServerThread;

public class ExMother {

	////////////////////////////////////////////////////////////////

	public static void main(String[] args) throws IOException {
		
		ServerSocket serversocket = new ServerSocket();
		serversocket.bind(new InetSocketAddress("192.168.0.56", 10001));
		
		while(true) {
			Socket socket = serversocket.accept();
			Thread thread = new Exson(); 
			thread.start();
		}
		
	
	}
		
////////////////////////////////////////////////////////////////
}
