package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Houseinfo;
import com.aaa.entity.Pager;

public interface HouseDao {
	/**
	 * 录入
	 * @param info
	 */
	public void save(Houseinfo info);
	/**
	 * 查询
	 * @param info
	 * @param min
	 * @param max
	 * @return
	 */
	public List<Houseinfo> query(Houseinfo info,double min,double max);
	
	public List<Houseinfo> queryAll();
	
	
	public Pager queryByPages(int curPage,int pageSize);
	
	/**
	 * 查询并返回单个对象
	 * @param id
	 * @return
	 */
	public Houseinfo get(int id);
	
	public void delete(int id);
	/**
	 * 更新数据
	 * @param info
	 */
	public void update(Houseinfo info);
	
	public List<Map> testJSON();
}
