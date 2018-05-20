package com.javalec.exceptionEx;

public class MainClass {


	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
//		System.out.println(i * j);
//		System.out.println(i / j);//오류가 나면서 아래있는 코드들이 실행되지 않는다.
//		System.out.println(i + j);//실행안됨
//		System.out.println(i - j);//실행안됨

		//예외처리
		System.out.println(i * j);
		try {//오류가 예상되는 코드를 try로 감싸준다
			System.out.println(i / j);
		} catch (Exception e) {
			System.out.println(e.getMessage());//에러메시지를 띄워주고 아래는 그대로 실행
			//e.printStackTrace();//메시지를 좀 더 자세히 보고싶을때 
		}
		System.out.println(i + j);
		System.out.println(i - j);		
		
	}
}
