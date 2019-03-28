package com.example.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.config;
import com.example.boot.pojo.person;

//@ComponentScan(value= {"com.example"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {
//	static {
//		
//		AnnotationConfigApplicationContext aac=new AnnotationConfigApplicationContext(config.class);
//		System.out.println("+++++++++++++");
//	}
	@Autowired()
//	@Qualifier(value="getperson")
	person  p;
	@Test
	public void contextLoads() {
//		AnnotationConfigApplicationContext aac=new AnnotationConfigApplicationContext(config.class);
//		Object p= aac.getBean("getperson");
		System.out.println(p);
		
		
	}
	
	@Autowired
	Tconfig t;
	
	@Test
	public void testconfig() {
		System.out.println(t.getName());
	}

}
