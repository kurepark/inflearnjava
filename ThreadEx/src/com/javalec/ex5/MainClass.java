package com.javalec.ex5;

public class MainClass {
	
	public static void main(String[] args) {
		
		VoteThread voteThread1 = new VoteThread();
		VoteThread voteThread2 = new VoteThread();
		VoteThread voteThread3 = new VoteThread();
		
		Thread location1 = new Thread(voteThread1,"Location1");
		Thread location2 = new Thread(voteThread2,"Location2");
		Thread location3 = new Thread(voteThread3,"Location3");
		
		location1.start();
		location2.start();
		location3.start();
		
	}

}
