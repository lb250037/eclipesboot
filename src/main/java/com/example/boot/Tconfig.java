package com.example.boot;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Tconfig {
	private String name="tconfig";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
