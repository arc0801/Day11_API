package com.arc.collection.ex4;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {

	public void view(String str) {
		
		System.out.println(str);
		
		
	}
	
	
	public void view (Weather weather) {
		
		
		
	}
	
	
	
	
	//메서드명 view
	//날씨 전체 정보 출력
	public void view(HashMap<String, Weather> map) {
		//1단계
		//키들을 모을 Iterator 생성
		Iterator<String> wt = map.keySet().iterator();
		
		while(wt.hasNext()) {
			String key = wt.next();
			System.out.println(map.get(key).getCity());
			System.out.println(map.get(key).getGion());
			System.out.println(map.get(key).getHumidity());
			System.out.println(map.get(key).getStatus());
		}
	}
	
	//메서드명 view
	//날씨 하나 정보 출력
	
	
}
