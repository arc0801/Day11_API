package com.arc.collection.ex2;

import java.util.ArrayList;

public class StudentView {

	//메서드명은 view
	//학생한명 출력
	public void view(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getKor());
		System.out.println(student.getEng());
		System.out.println(student.getMath());
		System.out.println(student.getSum());
		System.out.println(student.getAvg());
	}
	
	
	
	
	
	//메서드명은 view
	//학생들의 정보를 전부 출력 - 2번
	//students 매개변수 통해서
	public void view(ArrayList<Student> students) {
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i).getName());
			System.out.println(students.get(i).getNum());
			System.out.println(students.get(i).getKor());
			System.out.println(students.get(i).getEng());
			System.out.println(students.get(i).getMath());
			System.out.println(students.get(i).getSum());
			System.out.println(students.get(i).getAvg());
		}//for
		
		
	}//view
}
