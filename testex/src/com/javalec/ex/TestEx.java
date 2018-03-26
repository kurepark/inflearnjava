package com.javalec.ex;

public class TestEx {
	public static void main(String[] args) {
	/*	int i = 10;
		int j = 20;
		int h = 30;
		
		char c = 'A';
		char d = 'a';
		char e = 'B';
		
		System.out.println(i);//괄호안의 내용을 콘솔에 찍어본다 ctrl+space 자동완성단축키
		System.out.println(j);
		System.out.println(h);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
		//ctrl+f11  run 단축키
		
/*		char c = 'C';//문자 타입
		int i = 10; //정수 타입
		double d = 3.14D;//소수표시, 더블형타입 표기를 위해 대문자 D를 사용
		boolean b = true;//블리언, 참, 거짓
		
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);*/
		
		//형변환
		int i = 10;
		double d = i;
		
		double d2 = 3.14D;
		//int i2 = d2;// 이렇게 쓰면 오류가 나온다
		int i2 = (int)d2;//형변환을 해줘야함
		System.out.println(d2);
		System.out.println(i2);
		
	}


}
