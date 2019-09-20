package com.arc.collection.ex3;

public class Weather {
	//기상청 날씨정보
	private String city; //도시이름
	private double gion; //기온
	private int humidity; //습도
	private String status; //현재 날씨 상태 맑음..흐림..
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getGion() {
		return gion;
	}
	public void setGion(double gion) {
		this.gion = gion;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
