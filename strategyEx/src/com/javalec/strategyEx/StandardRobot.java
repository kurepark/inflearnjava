package com.javalec.strategyEx;

public class StandardRobot extends Robot {
	
	public StandardRobot() {
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
		System.out.println("미사일을 쏠 수 있습니다");

	}
	
	@Override
	public void actionSword() {
		// TODO Auto-generated method stub
		System.out.println("목검을 쓸 수 있습니다");

	}


}
