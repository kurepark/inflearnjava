package com.javalec.ex3;

public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public synchronized void run() {//synchronized키워드 추가 이렇게 되면 A실행이 끝난 후에 B가 실행이 된다.
		// TODO Auto-generated method stub
		

		
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("=================================");
				testNum++;
			}
			System.out.println("Thread Name: " +Thread.currentThread().getName() + "testNum : " + testNum);
			
			try {
				Thread.sleep(500);
			}catch (Exception e){}
		}

	}

}
