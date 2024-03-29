package com.arc.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class WeatherService {
	private Scanner sc;
	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejeon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		sc = new Scanner(System.in);
	//문자열하나 파싱하는거 토크나이저 사용
	}
	
	//메서드명 init
	//날씨 정보를 파싱해서 저장
	public HashMap<String, Weather> init() {
		StringTokenizer st = new StringTokenizer(sb.toString(), "-");
		//HashMap에 추가
		//키는 도시명, value weather
		//리턴은 HashMap
		HashMap<String, Weather> map = new HashMap<String, Weather>();
		
		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			
			map.put(weather.getCity(), weather);
		}
		return map;
	}//init
	
	
	//메서드명 addweather
	//날씨 정보를 입력받아서 추가
	public Weather addWeather(HashMap<String, Weather> map) {
		Weather weather = new Weather();
		System.out.println("도시를 입력하세요");
		weather.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weather.setGion(sc.nextDouble());
		System.out.println("습도를 입력하세요");
		weather.setHumidity(sc.nextInt());
		System.out.println("상태를 입력하세요");
		weather.setStatus(sc.next());
		map.put(weather.getCity(), weather);
		
		return weather;
	}//addWeather
	
	
	public Weather findWeather(HashMap<String, Weather> map) {
		//도시명을 입력 받아서 해당Weather 검색
		//weather를 리턴
		//Weather weather = new Weather();
		System.out.println("도시명을 입력하세요");
		String name = sc.next();
		Weather weather = map.get(name);
		
		return weather;
	}//findWeather
	
	
	public Weather deleteWeather(HashMap<String, Weather> map) {
		//도시명입력 받아서 해당 정보(weather)를 삭제
		System.out.println("삭제 도시명");
		String city = sc.next();
		Weather weather = map.remove(city);
		
		return weather;
	}//deleteWeather
	
	
}
