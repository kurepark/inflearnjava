package com.javalec.ex;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//난수만들기
//		 double d = Math.random();
//		 System.out.println(d);
//		 
//		 //정수형 난수 만들기
//		 int di = (int)(d *10);//더블형에 *10을 한 후에 형변환
//		 System.out.println(di);
//		 
//		 //랜덤클래스를 활용한 난수
//		 Random random = new Random();
//		 int i = random.nextInt(100);
//		 System.out.println(i);
//		 
//		 //스캐너객체
//		 Scanner scanner = new Scanner(System.in);
//		 
//		 String str2 =  scanner.nextLine();//개행문자까지만 인식하고 그 다음은 버림
//		 System.out.println(str2);
//		 
//		 String srt1 = scanner.next();//개행 \n도 인식
//		 System.out.println(srt1);
//		 
//		 System.out.println("end");
		 
//		 //wrapper클래스
//		 Integer integer = new Integer(234);
//		 int i = integer.intValue();
//		 System.out.println(i);
		 
		 String str = "123";//문자열
		 int i = Integer.parseInt(str);//문자열을 숫자로 반환형이 integer이니 int i에 담을수 있다
		 System.out.println(i + 10);
		 
	}
}
