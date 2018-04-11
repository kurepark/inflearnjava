package com.javalec.ex;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
/*		int[] iArr = {10,20,30,40,50};
		System.out.println(iArr[3]);//40;
		
		
		//배열의 크기만 정하고 값은 나중에 할당하는 방식
		int[] jArr = new int[3];
		jArr[0] = 1;
		jArr[1] = 0;
		jArr[2] = 3;
		System.out.println(jArr[1]);//0 */
		
		String[] iArrName = {"영희","철수","길동","현철","혜진"};
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner scanner = new Scanner(System.in);//scanner를 이용해 사용자가 값을 입력
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(iArrName[i]+"키를 입력 하세요. : ");
			iArr[i] = scanner.nextInt();
			totalHeight = totalHeight + iArr[i];//for문을 돌리면서 입력한 키를 합산
		}
		System.out.println("학생들의 평균 신장은 "+ (totalHeight/iArrName.length)+"입니다");
		
		for(int i = 0; i <iArr.length; i++) {
			if(iArr[i]>maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		System.out.println("가장 큰 학생은 " + iArrName[maxHIndex]+"입니다");
		
		minH = maxH;//minH의 초기값이 0 이므로 가장큰 학생의 값을 넣어주고 그 값과 비교하며 작은값을 찾아 넣는다
		for(int i = 0; i <iArr.length; i++) {
			if(iArr[i]< minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("가장 작은 학생은 " + iArrName[minHIndex]+"입니다");
	}
}
