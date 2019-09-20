package com.arc.stringTokenizer.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {

	private String memberInfo;

	public MemberMaker() {
		this.memberInfo = "iu-iu-27-choa-choa-28-suji-suji-30";
	}

	public void makeMember() {
		//memberInfo의 내용을 파싱해서 
		//Member 객체를 생성
		//모든 정보를 출력

		StringTokenizer st = new StringTokenizer(this.memberInfo, "-");
		//Member [] members = new Member[3];
		ArrayList<Member> ar = new ArrayList<Member>();
		//int index = 0;

		while(st.hasMoreTokens()) {
			Member m = new Member();
			m.setId(st.nextToken());
			m.setName(st.nextToken());
			m.setAge(Integer.parseInt(st.nextToken()));
			ar.add(m);
			//members[index]=m;
			//index++;
		}

		for(int i=0;i<ar.size();i++) {
			System.out.println("Id : "+ar.get(i).getId());
			System.out.println("Name : "+ar.get(i).getName());
			System.out.println("Age : "+ar.get(i).getAge());
		}


	}
}
