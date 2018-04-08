package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		//1~10까지의 합
/*		int j = 11;
		int sum = 0;
		for(int i = 1 ; i < j; i++) {
			sum = sum + i;
		}
		System.out.println(sum);*/
		
		//짝수의 합
/*		int j = 11;
		int sum = 0;
		for(int i = 1 ; i < j; i++) {
			int h = i % 2;
			if(h == 0) {//짝수는  0 홀수는 h == 1
				sum = sum + i;
			}	
		}
		System.out.println(sum);*/
		
		//구구단
/*		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i +"="+ (j * i) + "\t");//\t 간격유지, 탭사용하듯
			}
			System.out.println("");
			
		}*/
		//1~100숫자중 3의 배수의 합 구하기
		int sum = 0;
		int i = 0;
		while(i <= 100) {
			if(i % 3 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
