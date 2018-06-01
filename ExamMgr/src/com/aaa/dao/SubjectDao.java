package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.entity.TabSubject;

public interface SubjectDao {
	
	/**
	 * ��ѯ���п�Ŀ
	 * @return
	 */
	public Pager findAll(Pager pager);
	
	/**
	 * �����Ŀ
	 * @param g
	 */
	public void save(TabSubject s);
	
	/**
	 * �޸Ŀ�Ŀ
	 * @param g
	 */
	public void update(TabSubject s);
	
	/**
	 * ���ݿ�Ŀ��Ż�ȡ��Ŀ��Ϣ
	 * @param id
	 * @return
	 */
	public TabSubject findById(int id);
	
	

}
