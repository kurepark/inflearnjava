package com.javalec.manager;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {//메인메소드는 클래스와는 상관이 없다. 메인메소드는 별개의 존재
		
		//클래스 객체 생성
		StudentManager manager = new StudentManager();
		manager.addStudent("홍길동", 22, 20123487, "연극영화과");
		manager.addStudent("김고양", 24, 20101234, "수학과");
		manager.addStudent("박둘기", 21, 20138521, "국문과");
		manager.addStudent("이멍멍", 23, 20113457, "체육과");
		manager.addStudent("정야옹", 26, 20087954, "무용과");
		
		//0번째 인덱스 정보 가져오기
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
		//정보 수정
		manager.students.get(0).updateInfo(1, "김들개");
		System.out.println(manager.students.get(0).getName());
	}
	
	//학생을 추가하는 메소드
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		students.add( new Student(name, age, studentNum, major));
		System.out.println(name + "학생 정보 입력 성공");

	}
}
