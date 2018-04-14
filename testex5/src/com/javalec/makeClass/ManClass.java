package com.javalec.makeClass;

public class ManClass {

	//그동안 변수를 만들때 int i = 10; int 앞에 public이 숨겨져 있다. 누구나 쓸 수 있음.
	private int age;//private 는 클래스 내부에서만 변수를 사용할 때 사용. 다른 객체에서는 사용할 수 없다.
	private int height;//기본적으로 클래스의 변수는 private으로 만듬
	private int weight;//이러한 변수는 밖에서 사용할 수 없어서 getter, setter를 사용. 빈공간에서 마우스 오른쪽 - >generate getters, setters
	private String phoneNum;
	/////여기까지 데이터, 클래스 안에 있는 변수 - 인스턴스 변수
	
	
	//파리미터가 없는 생성자 = 디폴트 생성자
	//생성자는 갯수 제한이 없다.
	public ManClass() {
		
	}
	//파라미터가 있는 생성자, 생성을 하면서 데이터를 넣을때.
	public ManClass(int age, int height, int weight, String phoneNum) {
		this.age = age; // this는 자기 자신을 말한다. 이 객체가 가지고 있는 age에 매개변수 age를 준다. 여기서는 파라미터로 들어온 값을 this.age에 넣는다
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
	}
	
	public double calculateBMI() {
		double result = weight / (height * height);
		return result;
	}
	
	//바깥에서 값을 사용하고 싶을땐 getter/setter를 사용한다.
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}


