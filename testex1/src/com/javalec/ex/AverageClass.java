package com.javalec.ex;

import java.util.Scanner;

public class AverageClass {
	
	public static void main(String[] args) {//���α׷����۽� �ڹٰ� ���� ã�°�, ���θ޼ҵ�
		
/*		Scanner scanner = new Scanner(System.in);
		System.out.print("���������� �Է��ϼ���");
		int kor = scanner.nextInt();
		System.out.print("���������� �Է��ϼ���");
		int eng = scanner.nextInt();
		System.out.print("���������� �Է��ϼ���");
		int mat = scanner.nextInt();
		
		//��ձ��ϱ�, �Ҽ����� ���ü� ������ ������
		double ave = (kor + eng + mat)/3;
		System.out.println("���������"+ave+"�Դϴ�");
		
		if(kor > ave) {
			System.out.println("���������� ����������� �����ϴ�");
		}else if(kor < ave) {
			System.out.println("���������� ����������� �����ϴ�");
		}else {
			System.out.println("���������� ����Դϴ�");
		}*/
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int r = i % 2;
		
		switch(r) {
		case 0 :
			System.out.println("¦���Դϴ�");
			break;//break�� ������ �ش� ������ Ż��
		case 1 :
			System.out.println("Ȧ�� �Դϴ�");
			break;
			
		default : 
			System.out.println("�𸣰ڽ��ϴ�");
			break;
		}
		
	}

}
