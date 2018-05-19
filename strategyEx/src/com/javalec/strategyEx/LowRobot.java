package com.javalec.strategyEx;

public class LowRobot extends Robot {
	
	public LowRobot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 없습니다");

	}
	
	@Override
	public void actionMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 쏠 수 없습니다");

	}
	
	@Override
	public void actionSword() {
		// TODO Auto-generated method stub
		System.out.println("검이 없습니다");

	}
}
