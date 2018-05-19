package com.javalec.strategyEx;

import com.javalec.robotex.inter.FlyYes;

public class SuperRobot extends Robot {//공통적인 기능이 있는 robot클래스를 상속받는다
	
	//인터페이스를 이용해서 변수를 생성
/*	IFly fly = new FlyYes();
	IMissile missile = new MissileYes();
	ISword sword = new SwordLazer();*/
	
	//혹은 아래처럼 변수만 선언하고 getter/setter를 사용할 수 있다.
//	IFly fly;
//	IMissile missile;
//	ISword sword;
	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		//fly = new FlyYes();//메인메소드에서 set을 까먹을 수 있기때문에 여기서 미리 지정도 가능하다
		//객체가 생성될때 할당이 되기때문에 메인메소드에서 set을 안해도 된다
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다");

	}
	

	
	//이렇게 set을 사용할 수 있다
	//super standard low에 중복되는 변수선언과 setter는 robot클래스로 옮겨준다

//	public void setFly(IFly fly) {
//		this.fly = fly;
//	}
//	
//	public void setMissile(IMissile missile) {
//		this.missile = missile;
//	}
//	
//	public void setSword(ISword sword) {
//		this.sword = sword;
//	}
}
