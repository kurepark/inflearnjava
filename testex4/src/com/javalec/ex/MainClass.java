package com.javalec.ex;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
/*		int[] iArr = {10,20,30,40,50};
		System.out.println(iArr[3]);//40;
		
		
		//�迭�� ũ�⸸ ���ϰ� ���� ���߿� �Ҵ��ϴ� ���
		int[] jArr = new int[3];
		jArr[0] = 1;
		jArr[1] = 0;
		jArr[2] = 3;
		System.out.println(jArr[1]);//0 */
		
		String[] iArrName = {"����","ö��","�浿","��ö","����"};
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner scanner = new Scanner(System.in);//scanner�� �̿��� ����ڰ� ���� �Է�
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(iArrName[i]+"Ű�� �Է� �ϼ���. : ");
			iArr[i] = scanner.nextInt();
			totalHeight = totalHeight + iArr[i];//for���� �����鼭 �Է��� Ű�� �ջ�
		}
		System.out.println("�л����� ��� ������ "+ (totalHeight/iArrName.length)+"�Դϴ�");
		
		for(int i = 0; i <iArr.length; i++) {
			if(iArr[i]>maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		System.out.println("���� ū �л��� " + iArrName[maxHIndex]+"�Դϴ�");
		
		minH = maxH;//minH�� �ʱⰪ�� 0 �̹Ƿ� ����ū �л��� ���� �־��ְ� �� ���� ���ϸ� �������� ã�� �ִ´�
		for(int i = 0; i <iArr.length; i++) {
			if(iArr[i]< minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("���� ���� �л��� " + iArrName[minHIndex]+"�Դϴ�");
	}
}
