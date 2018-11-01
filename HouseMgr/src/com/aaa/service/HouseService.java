package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.dao.HouseDao;
import com.aaa.dao.HouseDaoImpl;
import com.aaa.entity.Houseinfo;
import com.aaa.entity.Pager;

public class HouseService {
	HouseDao dao=new HouseDaoImpl();
	public void save(Houseinfo info){
		dao.save(info);
	}
	
	public List<Houseinfo> query(Houseinfo info,double min,double max){
		return dao.query(info, min, max);
	}
	
	public Houseinfo get(int id){
		return dao.get(id);
	}
	
	public void delete(int id){
		dao.delete(id);
	}
	
	public List<Houseinfo> queryAll(){
		return dao.queryAll();
	}
	
	public void update(Houseinfo info){
		dao.update(info);
	}
	
	 public List<Map> testJSON(){
		return dao.testJSON();
	 }	
	 
	 public Pager queryByPages(int curPage,int pageSize){
		 return dao.queryByPages(curPage, pageSize);
	 }
}
