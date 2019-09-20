package com.arc.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		//1,2,3
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add('c');
		ar.add(3);
		ar.add("four");//어떤 데이터 형태든지 다 받을 수 있음
		
		ar.add(1, "two");
		ar.set(1, 10000);
		
		ar.remove(1);
		//ar.clear();
		int num = 10;
		Integer n = num; //auto Boxing
		ar.add(num); //auto Boxing
		num = (int)ar.get(0); // get의 값이 object이기 때문에 형변환 해줘야 함
		String name = (String)ar.get(3);
		
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}



	}

}
