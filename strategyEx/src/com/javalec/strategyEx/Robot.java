package com.javalec.strategyEx;

public abstract class Robot {//공통적인 부분을 robot클래스로 묶어 각 클래스에 상속시켜준다
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다");
	}
	
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("달릴 수 있습니다");
	}
	
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다");

	}
	

	//추상클래스로 만든다. 추상클래스는 구현부가 없으므로 sysout부분을 모두 제거
	public abstract void actionFly();
	
	public abstract void actionMissile();
	
	public abstract void actionSword();

}
