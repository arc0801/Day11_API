package com.arc.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class StudentMenu {
	private ArrayList<Student> students;
	private StudentView sv;
	private StudentService ss;
	private Scanner sc;
	
	public StudentMenu() {
		students = new ArrayList<Student>();
		sv = new StudentView();
		ss = new StudentService();
		sc = new Scanner(System.in);
	}
	
	
	public void start() {
		//1. 학생 정보 등록
		//2. 학생 전체 정보 출력
		//3. 학생 정보 조회 - 이름으로 검색
		//4. 학생 정보 삭제
		//5. 프로그램 종료
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 전체 정보 ");
			System.out.println("3. 학생 정보 조회");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 프로그램  종료");
			int select = sc.nextInt();
			Student student;
			
			switch(select) {
			case 1:
				ss.studentInput(students);
				break;
				
			case 2:
				sv.view(students);
				break;
				
			case 3:
				student = ss.studentSearch(students);
				sv.view(student);
				break;
				
			case 4:
				//student = ss.studentDelete(students, student);
				
				System.out.println("학생 정보 삭제");
				break;
				
			default:
				System.out.println("프로그램 종료");
				check = false;
				break;
			}//switch
		}//while
	}//start
}
