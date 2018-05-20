package com.javalec.throwsEx;

public class ThrowsExClass {
	
	public ThrowsExClass() {//생성자
		// TODO Auto-generated constructor stub
		actionC();
	}
	
	private void actionA() throws Exception {//2 오류 발생시 throws처리함. actionA를 호출한 곳으로 돌려보냄
		// TODO Auto-generated method stub
		System.out.println("actionA");
		
		int[] iArr = {1, 2, 3, 4};
		System.out.println(iArr[4]);//1. 배열 인덱스4는 없다. 오류발생
		
		System.out.println("actionAA");
	}
	
	private void actionB() {// 3. actionA를 호출한 B로 돌아옴
		// TODO Auto-generated method stub
		System.out.println("actionB");
	
		try {
			actionA();// 4. actionA에 대한 예외처리가 있다
		} catch (Exception e) {// 5. actionA에 대한 예외처리 콘솔로 찍음
			System.out.println("예외는 여기서 처리 할께요");
			System.out.println(e.getMessage());
		}
		System.out.println("actionBB");// 6. 예외처리 후 그대로 코드 실행
	}
	
	private void actionC() {
		// TODO Auto-generated method stub
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}
	

}
