package com.arc.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//현재 시간의 정보
		Calendar cal = Calendar.getInstance(); 
		//new GregorianCalendar() 객체 만들어서 리턴 받아오란 소리임.

		//get
		int hour = cal.get(Calendar.HOUR); //12시 기준
		hour = cal.get(Calendar.HOUR_OF_DAY); //24시 기준
		int min = cal.get(Calendar.MINUTE);
		//연도
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);//1월 -> 0, 2월 -> 1, 3월 -> 2...
		int date = cal.get(Calendar.DATE);
		int d = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(year);
		System.out.println(mon+1);
		System.out.println(date);
		System.out.println(d);
	}

}
