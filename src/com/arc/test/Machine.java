package com.arc.test;

import java.util.Calendar;

public class Machine {

	//콜라 선택
	public Cola makeCola() {
		Cola cola = new Cola();
		cola.setBrand("CocaCola");
		cola.setPrice(1500);
		cola.setCalendar(Calendar.getInstance());
		return cola;
	}
	
	
	//사이다
	public Cider makeCider(String brand, int price, Calendar calendar) {
		Cider cider = new Cider(); //객체를 만들어서 메서드 내에서 추가적으로 무언가를 다루고싶을때
		cider.setBrand(brand);
		cider.setPrice(price);
		cider.setCalendar(calendar); //다른 곳에서 데이터 받아와야할 때
		
		return cider;		
	}
	
	
	//물
	public Water makeWater() {
		return new Water(); //그냥 만들어서 되돌려 주기만 하고싶을 때
	}
	
	
	
}
