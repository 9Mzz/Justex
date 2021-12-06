package com.javaex.ex01;
public class ExApp {
	public static void main(String[] args) {
		
		int[] arrA = new int[] {3,60,1};
		int[] arrB = new int[] {3,10,1};
		
		if (arrA.length == arrB.length) {
			for(int i=0; i<arrA.length; i++) {
				if (arrA[i] !=arrB[i]) {
					System.out.println(i+"번째가 다릅니다.");
					
				}
			}
			
		}
		
		
	}

}
