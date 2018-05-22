package com.javalec.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		
		Thread thread = new Thread(threadTest,"A");//thread이름이 A
		thread.start();//내가만든 스레드가 먼저 시작되었지만 스레드는 별개의 작업이므로 메인스레드는 자기 먼저 찍히고 그 다음 thread.start진행
		
		System.out.println(thread.currentThread().getName());//main 메인스레드의 이름이 여기서 출력.
	}

}
