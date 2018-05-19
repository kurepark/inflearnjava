package com.javalec.singletonex;

public class FirstClass {//클래스
	
	public FirstClass() {//클래스명과 동일한 생성자
		// TODO Auto-generated constructor stub
		
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		//싱글턴클래스라는 데이터 타입의 싱글턴클래스라는 이름의 변수
		//싱글턴클래스는 접근제한이 있기 때문에 생성할 수 없어 생성하기 전에 클래스 단계에서 getsingletonclass를 사용
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());
	}

}
