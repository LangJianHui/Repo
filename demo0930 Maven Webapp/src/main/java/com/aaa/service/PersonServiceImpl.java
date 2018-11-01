package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.PersonDao;
import com.aaa.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao dao;

	@Override
	public int save(Person p) {
		return dao.save(p);
	}

	@Override
	public List<Person> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public List<Map<String, Object>> query2() {
		// TODO Auto-generated method stub
		return dao.query2();
	}

	@Override
	public List<Map<String, Object>> query4(Map map) {
		// TODO Auto-generated method stub
		return dao.query4(map);
	}

}
