package com.aaa.service;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.entity.TabSubject;

public interface SubjectService {
	/**
	 * 查询所有
	 * @return
	 */
	public Pager findAll(Pager pager);
	
	/**
	 * 保存
	 * @param g
	 */
	public void save(TabSubject s);
	
	/**
	 * 修改
	 * @param g
	 */
	public void update(TabSubject s);
	
	/**
	 * 根据编号获取对象
	 * @param id
	 * @return
	 */
	public TabSubject findById(int id);
}
