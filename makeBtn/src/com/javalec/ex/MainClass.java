package com.javalec.ex;

import java.awt.Dimension;

public class MainClass {

	public static void main(String[] args) {
		
		MakeBtn btn = new MakeBtn();
		//btn.pack();//크키조절
		btn.setSize(new Dimension(200,200)); // 내가 임의로 버튼의 크기를 결정할 수 있다. 
		btn.setVisible(true);//버튼을 보여줌
		
		try {
			Thread.sleep(2000);//2초간 보여줌
		} catch(Exception e) {}
		
		btn.setVisible(false);//버튼이 보이지 않도록
		btn.dispose();//자원을 해제
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		System.exit(0);//프로세스 종료(콘솔창에 중지, 닫기 버튼이 비활성화 되면 종료되는 것)
	}
}
