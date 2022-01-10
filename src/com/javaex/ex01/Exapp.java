package com.javaex.ex01;

public class Exapp {
	public static void main(String[] args) {
////////////////////////////////////////////////////////
		Ex01 ex01 = new Ex01();
		System.out.println(ex01.company);
		System.out.println();
		
		Ex01 ex02 = new Ex01("자가용");
		System.out.println(ex02.getCompany());
		
		System.out.println(ex02.model);
		System.out.println(ex02.getModel());
		
////////////////////////////////////////////////////////
	}
}
