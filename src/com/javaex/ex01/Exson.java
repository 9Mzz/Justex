package com.javaex.ex01;

public class Exson extends ExMother {
	/////////////////////////////////////////////////////////////////////

	public static final int normal = 1;
	public static final int supersonic = 2;

	public int flyMode = normal;

	public void fly() {
		if (flyMode == supersonic) {
			System.out.println("초음속 비행합니다.");
		} else {
			//Airplane객체의 fly 메소드 
			super.fly();
		}
	}

	/////////////////////////////////////////////////////////////////////
}
