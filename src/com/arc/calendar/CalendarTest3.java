package com.arc.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance(); //추상메서드라 new 안 됨!!!!
		//택배
		//현재의 년월일
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		//이틀 뒤의 년월일
		//calendar.set(Calendar.DATE, date+2);
		//calendar.roll(Calendar.DATE, 2); //해당 필드만 바뀜. 다른 건 그대로~~
		calendar.add(Calendar.DATE, 10); // 달력 법칙에 따라 전체가 다 바뀜
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		date = calendar.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}

}
