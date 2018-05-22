package com.javalec.ex;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());//현재 구동되는 thread의 이름을 구하는 메소드. A가 찍힘
		System.out.println("ThreadTest");//ThreadTest
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			try {		//thread구현시 try catch문 필요	
				Thread.sleep(500);	//i 0~9까지 찍힘
			}catch( Exception e) {}
		}

	}

}
