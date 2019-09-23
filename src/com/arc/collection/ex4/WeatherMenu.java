package com.arc.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {
	private WeatherService ws;
	private WeatherView wv;
	public WeatherMenu() {
		ws = new WeatherService();
		wv = new WeatherView();
	}


	//메서드명 start
	//1. 날씨 정보 초기화 - init
	//2. 날씨 정보 추가 - addWeather
	//3. 전체 날씨 정보 - view
	//4. 지역 날씨 검색 - findWeather, view
	//5. 날씨 정보 삭제
	//6. 프로그램 종료

	public void start() {
		System.out.println("1.날씨 정보 초기화");
		System.out.println("2.날씨 정보 추가");
		System.out.println("3.전체 날씨 정보");
		System.out.println("4.지역 날씨 검색");
		System.out.println("5.날씨 정보 삭제");
		System.out.println("6.프로그램 종료");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		switch(select) {
		case 1:

			HashMap<String, Weather> map = ws.init();
			wv.view(map);
			break;
			
		case 2:
			
			
		case 3:

		case 4:
			Weather weather = ws.findWeather(map);
			if(weather != null) {
				wv.view(weather);

				
				
			}else {
				wv.view("해당 지역 정보가 없습니다.");
			}
			wv.view(weather);
			break;
		case 5:
			Weather weather = ws.findWeather(map);

			if(weather != null) {
				wv.view("삭제 성공");
			}else {
				wv.view("삭제 실패");
			}
			break;

		default:
		}	
	}
}