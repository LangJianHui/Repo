package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.entity.TabSubject;

public interface SubjectDao {
	
	/**
	 * 查询所有科目
	 * @return
	 */
	public Pager findAll(Pager pager);
	
	/**
	 * 保存科目
	 * @param g
	 */
	public void save(TabSubject s);
	
	/**
	 * 修改科目
	 * @param g
	 */
	public void update(TabSubject s);
	
	/**
	 * 根据科目编号获取科目信息
	 * @param id
	 * @return
	 */
	public TabSubject findById(int id);
	
	

}
