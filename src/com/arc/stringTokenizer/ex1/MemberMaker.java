package com.arc.stringTokenizer.ex1;

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
		Member [] members = new Member[3];
		int index = 0;

		while(st.hasMoreTokens()) {
			Member m = new Member();
			m.setId(st.nextToken());
			m.setName(st.nextToken());
			m.setAge(Integer.parseInt(st.nextToken()));
			members[index]=m;
			index++;
		}

		for(int i=0;i<members.length;i++) {
			System.out.println("Id : "+members[i].getId());
			System.out.println("Name : "+members[i].getName());
			System.out.println("Age : "+members[i].getAge());
		}


	}
}
