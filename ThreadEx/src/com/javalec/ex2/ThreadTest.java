package com.javalec.ex2;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e){}
		}

	}

}
