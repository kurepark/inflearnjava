package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		//1~10������ ��
/*		int j = 11;
		int sum = 0;
		for(int i = 1 ; i < j; i++) {
			sum = sum + i;
		}
		System.out.println(sum);*/
		
		//¦���� ��
/*		int j = 11;
		int sum = 0;
		for(int i = 1 ; i < j; i++) {
			int h = i % 2;
			if(h == 0) {//¦����  0 Ȧ���� h == 1
				sum = sum + i;
			}	
		}
		System.out.println(sum);*/
		
		//������
/*		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i +"="+ (j * i) + "\t");//\t ��������, �ǻ���ϵ�
			}
			System.out.println("");
			
		}*/
		//1~100������ 3�� ����� �� ���ϱ�
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
