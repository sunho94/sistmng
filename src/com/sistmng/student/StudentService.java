package com.sistmng.student;

import java.util.*;

import com.sistmng.Current;

public class StudentService {
	
	StudentDAO dao = new StudentDAO();
	
	public void menu_1() {
		System.out.println("");
		Student student = this.dao.menu_1(Current.getInstance().getCurrent());
		System.out.printf("이름: %s",student.getName_());
		System.out.printf("주민번호: %s", student.getSsn());
		System.out.printf("전화번호: %s", student.getPhone());
		System.out.printf("과정수강횟수", student.getCourseNumber());
	}
	
	public void menu_2(Scanner sc) {
		List<Student> studentList = this.dao.menu_2(Current.getInstance().getCurrent());
		System.out.println("성적을 조회합니다.");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("과정코드 / 과정명 / 시작일 / 종료일 / 강의실 /수료");
		System.out.println("------------------------------------------------------------------------------------------------------");
		for(Student s : studentList) {
			System.out.printf("%s / %s / %s / %s / %s / %s", s.getOpenCourseCode(), s.getCourseName(), s.getOpenCourseStartDate(), s.getOpenCourseCloseDate(), s.getClassName(), s.getCompletionCheck());
		}
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("1.과정 상세보기 0.나가기");
		int input = sc.nextInt();
		switch(input) {
		case 1:this.menu_21(sc);break;
		case 0:break;
		}
	}
	
	public void menu_21(Scanner sc) {
		
		System.out.println("0.나가기");
	}
}