package com.javalec.strategyEx;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.MissileYes;
import com.javalec.robotex.inter.SwordLazer;

public class MainClass {
	
	public static void main(String[] args) {//메인메소드
		
		System.out.println("SuperRobot을 만들어주세요");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();//단순히 actionfly만 호출하면 안되기 때문에 호출전에 setFly에서 원하는 기능을 호출.
		
		superRobot.setMissile(new MissileYes());
		superRobot.actionMissile();
		
		superRobot.setSword(new SwordLazer());
		superRobot.actionSword();
		
//		superRobot.setFly(new FlyNo());// 만약 중간에 변경사항이 생긴다면 이렇게 flyno객체를 사용해서 setfly한다
//		superRobot.actionFly();
		
	}

}
