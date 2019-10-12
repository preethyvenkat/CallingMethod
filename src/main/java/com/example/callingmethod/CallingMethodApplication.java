package com.example.callingmethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CallingMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallingMethodApplication.class, args);
		System.out.print("Preethy dear,you are a rockstar!!!");
	}

}
