package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Person;

public interface PersonService {
	public int save(Person p);
	public List<Person> queryAll();
	
	public List<Map<String,Object>> query2();
	
	public List<Map<String,Object>> query4(Map map);
}
