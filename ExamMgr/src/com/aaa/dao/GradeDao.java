package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;

public interface GradeDao {
	
	/**
	 * 查询所有年级 分页 
	 * @return
	 */
	public Pager findAll(Pager pager);
	
	/*
	 * 查询所有年级不分页
	 * */
	public Pager findAll();
	
	
	public List<TabGrade> findGrade();

	
	
	/**
	 * 保存年级
	 * @param g
	 */
	public void save(TabGrade g);
	
	/**
	 * 修改年级
	 * @param g
	 */
	public void update(TabGrade g);
	
	/**
	 * 根据年级编号获取年级对象
	 * @param id
	 * @return
	 */
	public TabGrade findById(int id);
	
	
	
	
	

}
