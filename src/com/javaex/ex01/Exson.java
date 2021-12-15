package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Exson extends Thread {
	/////////////////////////////////////////////////////////////////////

			private Socket socket;
			//생성자
			public Exson(Socket socket) {
				this.socket = socket;
			}
			//메소드 g/s

			
			//메소드 일반
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("연결됨");
				try {
					InputStream is = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(osw);
					
					while(true) {
						String msg = bw.newLine();
						if(msg ==null) {
							System.out.println("클라이언트 종료키 입력");
							break;
						}
						System.out.println("받은메세지: "+msg);

						bw.write(msg);
						bw.newLine();
						bw.flush();
						
					}
					br.close();
					bw.close();
					socket.close();
					
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
	
	
	/////////////////////////////////////////////////////////////////////
}
