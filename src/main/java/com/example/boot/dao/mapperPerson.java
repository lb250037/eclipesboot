package com.example.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.boot.pojo.person;

@Mapper
public interface mapperPerson {
	
	
	@Select("select * from person")
	public List<person> getall() ;

}
