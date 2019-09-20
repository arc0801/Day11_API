package com.arc.stringTokenizer;

//import java.util.ArrayList;
//import java.util.StringTokenizer;
import java.util.*; //와일드카드 ;모든 것을 다 불러옴
//import com.arc.m1.Member; //다른 패키지 거 쓰고싶으면 import를 써준다
//import com.arc.m2.Member;\

public class Test1 {

	public static void main(String[] args) {
		//파싱
		String str = "iu,27,suji,24,choa,30,hani,25";
				
		//Member m = new Member();
		//com.arc.m2.Member m2 = new com.arc.m2.Member();
		
		StringTokenizer st = new StringTokenizer(str, ",");	
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();//문자열 파싱
			String age = st.nextToken();
			System.out.println(s);
			System.out.println(age);
		}
		
		

	}

}
