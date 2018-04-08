package com.javalec.ex;

import java.util.Scanner;

public class AverageClass {
	
	public static void main(String[] args) {//프로그램시작시 자바가 먼저 찾는것, 메인메소드
		
/*		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요");
		int mat = scanner.nextInt();
		
		//평균구하기, 소수점이 나올수 있으니 더블형
		double ave = (kor + eng + mat)/3;
		System.out.println("평균점수는"+ave+"입니다");
		
		if(kor > ave) {
			System.out.println("국어점수는 평균점수보다 높습니다");
		}else if(kor < ave) {
			System.out.println("국어점수는 평균점수보다 낮습니다");
		}else {
			System.out.println("국어점수는 평균입니다");
		}*/
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int r = i % 2;
		
		switch(r) {
		case 0 :
			System.out.println("짝수입니다");
			break;//break를 만나면 해당 문법을 탈출
		case 1 :
			System.out.println("홀수 입니다");
			break;
			
		default : 
			System.out.println("모르겠습니다");
			break;
		}
		
	}

}
