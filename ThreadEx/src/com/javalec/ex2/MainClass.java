package com.javalec.ex2;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("b");
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
