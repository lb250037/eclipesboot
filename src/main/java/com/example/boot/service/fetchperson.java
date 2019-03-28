package com.example.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.dao.mapperPerson;
import com.example.boot.pojo.person;

@Service
public class fetchperson {
	@Autowired
	private mapperPerson per;
	
	public List<person> getallperson(){
		return per.getall();
	}
}
