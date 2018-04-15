package com.javalec.manager;

import java.util.ArrayList;

//재적한 학생 한명한명을 관리하는 클래스
public class StudentExpel {
	
	ArrayList<Student> expelStudents = new ArrayList<Student>();//배열 선언부 선언과 동시에초기화 해주어도 된다.
	
	//생성자
	public StudentExpel() {
		//expelStudents = new ArrayList<Student>();//초기화
	}
	
	//재적한 학생들 추가하는 메소드
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		expelStudents.add(new Student(name, age, studentNum, major));
		System.out.println("재적 학생 정보 등록 완료");//반환값 없이 배열에 담긴다.

	}
}
