package com.javaex.ex01;

import java.util.Scanner;

public class Ex01 {
	/////////////////////////////////////////////////////////
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Ex01() {}
	public Ex01(String model) {
		this.model = model;
	}
	public Ex01(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Ex01(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Ex01(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	//
	@Override
	public String toString() {
		return "Ex01 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	

	
	
	/////////////////////////////////////////////////////////

}
