package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@PropertySource("/hello/application.properties")
/*Note:- @PropertySource ka use hum application.propeties ka location find krne ke liye use krte h
		humara file src/main/resources ke ander directly likha hoga to @PropertySource ka use nhi krna hoga agar
		hamra file src/main/resources ke ander kisi folder jaise hello ke ander application.properties hoga to @PropertySource
		ka use krna hoga .
	
		agar hamara folder ka naam Config hoga to koi jrurat nhi h @PropertySource likhne ka or location path btana 

*/		
public class BootProj1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj1Application.class, args);
	
		MyApp app = ctx.getBean("cm",MyApp.class);
		
		System.out.println("My Data is "+app);
	
	}

}
