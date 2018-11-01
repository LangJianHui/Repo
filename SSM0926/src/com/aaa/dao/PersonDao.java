package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Person;

public interface PersonDao {
	public int save(Person p);
	public List<Person> queryAll();
	
	public List<Map<String,Object>> query2();
}
