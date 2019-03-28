package com.example.boot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boot.pojo.person;
import com.example.boot.service.fetchperson;

@Controller
@RequestMapping
public class Mycontrol {
	@Autowired
	private fetchperson feth;
	
	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		Logger logger = LoggerFactory.getLogger(Mycontrol.class);
		logger.warn("nihao srping boot!");
		return "hello spring boot!";
	}
	
//	@ResponseBody
//	@RequestMapping("getall")
//	public List<person> getall() {
//		List<person> list=feth.getallperson();
////		System.out.println(list);
//		return list;
//	}
//edit on git
//edit on eclipes
//editing client
	
	@ResponseBody
	@RequestMapping("getresp")
	public void  getall(HttpServletRequest req,HttpServletResponse rep) {
		 rep.setStatus(880);
		 try {
			req.getRequestDispatcher("error.html").forward(req, rep);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
