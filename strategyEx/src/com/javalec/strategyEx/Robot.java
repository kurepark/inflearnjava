package com.javalec.strategyEx;

import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.IMissile;
import com.javalec.robotex.inter.ISword;

public abstract class Robot {//공통적인 부분을 robot클래스로 묶어 각 클래스에 상속시켜준다
	
	
	IFly fly;
	IMissile missile;
	ISword sword;
	
	
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
	
	
	public abstract void shape();
	

	//추상클래스로 만든다. 추상클래스는 구현부가 없으므로 sysout부분을 모두 제거
//	public abstract void actionFly();
//	
//	public abstract void actionMissile();
//	
//	public abstract void actionSword();
//	
	
	//중복되는 setter 모음

	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	public void setSword(ISword sword) {
		this.sword = sword;
	}

	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.fly();
	}
	
	public void actionSword() {
		// TODO Auto-generated method stub
		this.sword.sword();
	}
	
	public void actionMissile() {
		// TODO Auto-generated method stub
		this.missile.missiel();
	}
	

}
