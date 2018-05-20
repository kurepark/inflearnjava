package com.javalec.timertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
	
	public TimerEx() throws InterruptedException{
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
		Timer timer = new Timer(true);//true를 해줘야 프로그램이 끝나면 종료되도록. 로직이 끝나면 프로그램이 제대로 종료됨
		TimerTask t1 = new ExTimerTask1();
		TimerTask t2 = new ExTimerTask2();
		
		timer.schedule(t1, 2000);//2초후 실행
		timer.schedule(t2, 10000);//10초후 실행
		
		Thread.sleep(11000);//11초간 작업을 기다림
		System.out.println("**");
		
	}

}
