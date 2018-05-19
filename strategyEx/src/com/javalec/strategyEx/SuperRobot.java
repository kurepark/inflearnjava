package com.javalec.strategyEx;

public class SuperRobot extends Robot {//공통적인 기능이 있는 robot클래스를 상속받는다
	
	public SuperRobot() {//디폴트생성자
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 있습니다");
		
	}
	
	@Override
	public void actionMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 쏠 수 있습니다");
		
	}
	
	@Override
	public void actionSword() {
		// TODO Auto-generated method stub
		System.out.println("검을 쓸 수 있습니다");
		
	}

}
