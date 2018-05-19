package com.javalec.singletonex;

public class SingletonClass {
	
	private static SingletonClass SINGELTON_CLASS_INSTANCE = new SingletonClass();
	//private 이므로 싱글톤클래스 안에서만 사용할 수 있다
	//static 데이터영역 클래스에 메모리를 사용
	//datatype이 singletonclass, 자기가 종속되어있는 클래스를 데이터타입으로 사용
	//변수명
	//객체 자기 자신을 생성해서 자신에게 할당
	public int i = 10;
	
	private SingletonClass() {//디폴트 생성자, 접근제한자가 private, 클래스 내부에서만 싱글톤클래스를 생성할 수 있다.
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonClass() {
		//이 메소드는 static 객체가 생성되기 전에 데이터 영역에 존재. 객체생성 전에도 사용가능
		
		if(SINGELTON_CLASS_INSTANCE == null) {
			SINGELTON_CLASS_INSTANCE = new SingletonClass();
		}
		return SINGELTON_CLASS_INSTANCE;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {//void 반환이 없다.
		this.i = i;
	}
}
