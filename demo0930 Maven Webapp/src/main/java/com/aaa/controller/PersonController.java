package com.aaa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Person;
import com.aaa.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService service;

	@RequestMapping("/save")
	public void save(Person p,HttpServletResponse response) throws IOException{
		System.out.println(p);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print(p);
	}
	
	
	
	@RequestMapping("/save1")
	public void save1(@RequestParam Map map){
		System.out.println(map);
		
	}
	
//	public void save2(@RequestParam("name") String name,@RequestParam("sex") String sex){
//		
//	}
	
	@RequestMapping("/query")
	@ResponseBody
	public List<Map<String,Object>> query(){
		return service.query2();
	}
	
	@RequestMapping("/query4")
	@ResponseBody
	public List<Map<String,Object>> query4(long id){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id", id);
		return service.query4(map);
	}
}
