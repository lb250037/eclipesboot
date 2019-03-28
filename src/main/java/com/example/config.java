package com.example;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.boot.pojo.person;
//@AutoConfigurationPackage
//@Configuration
public class config {
	
	@Bean
	public person getperson() {
		return new person(1238,"heo","nihao");
	}
	
//	@Bean
//	public void getperson() {
//	}

}
