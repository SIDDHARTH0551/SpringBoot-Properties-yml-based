package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cm")
public class MyApp {
	
	@Value("${myapp.name}")
	String name;
	@Value("${myapp.roll}")
	String roll;
	@Value("${myapp.city}")
	String city;
	
	
	
	public MyApp() {
		super();
	}


	public MyApp(String name, String roll, String city) {
		super();
		this.name = name;
		this.roll = roll;
		this.city = city;
	}
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getRoll() {
		return roll;
	}




	public void setRoll(String roll) {
		this.roll = roll;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	@Override
	public String toString() {
		return "MyApp [name=" + name + ", roll=" + roll + ", city=" + city + "]";
	}
//	
//	
	
	

}
