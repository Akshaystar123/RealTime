package com.realtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeApplication.class, args);
		
		System.out.println("hello");
	}

}
