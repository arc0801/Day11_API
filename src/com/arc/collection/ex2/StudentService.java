package com.arc.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class StudentService {

	private Scanner sc;
	
	public StudentService() {
		sc = new Scanner(System.in);
	}

	//studentDelete
	//이름을 입력해서 해당학생정보를 삭제
	public Student studentDelete(ArrayList<Student> students, Student student) {
		//students.remove(student);
		
		System.out.println("삭제 학생 이름");
		String name = sc.next();
		//boolean check = false;
		Student st = null;
		
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				st=students.remove(i);
				//check=true;
				break;
			}
		}
		
		return st;
		
		
	}
	
	
	
	
	
	
	
	//메서드명 studentSearch
	//학생의 이름을 입력 받아서, 이름이 같은 학생을 리턴
	//못 찾으면
	public Student studentSearch(ArrayList<Student> students) {
		
		System.out.println("조회하실 학생의 이름을 입력하세요");
		String name = sc.next();
		Student student = new Student();

		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}


	//메서드명은 studentInput
	//학생의 정보를 입력받는

	public void studentInput(ArrayList<Student> students) {
		
		Student student = new Student();

		System.out.println("학생의 이름을 입력하세요");
		student.setName(sc.next());
		System.out.println("학생의 번호를 입력하세요");
		student.setNum(sc.nextInt());
		System.out.println("학생의 국어점수를 입력하세요");
		student.setKor(sc.nextInt());
		System.out.println("학생의 영어점수를 입력하세요");
		student.setEng(sc.nextInt());
		System.out.println("학생의 수학점수를 입력하세요");
		student.setMath(sc.nextInt());

		student.setSum(student.getKor()+student.getEng()+student.getMath());
		student.setAvg(student.getSum()/3.0);

		students.add(student);

	}//sI
}
