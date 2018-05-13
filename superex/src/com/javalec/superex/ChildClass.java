package com.javalec.superex;

public class ChildClass extends ParentClass {
	
	public ChildClass() {//디폴트생성자
		// TODO Auto-generated constructor stub
		System.out.println("ChildCLASS");
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();//부모클래스의 method1을 먼저 실행
		
		System.out.println("ChildClass의 method1()입니다");
	}
}
