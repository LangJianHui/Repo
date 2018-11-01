package com.aaa.service;

import java.util.List;

import com.aaa.dao.HousetypeDao;
import com.aaa.dao.HousetypeDaoImpl;
import com.aaa.entity.Housetype;

public class HousetypeService {
	private HousetypeDao dao=new HousetypeDaoImpl();
	public List<Housetype> queryAll(){
		return dao.queryAll();
	}
	
}
