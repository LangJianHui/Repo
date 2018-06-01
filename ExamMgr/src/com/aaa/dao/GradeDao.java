package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;

public interface GradeDao {
	
	/**
	 * ��ѯ�����꼶 ��ҳ 
	 * @return
	 */
	public Pager findAll(Pager pager);
	
	/*
	 * ��ѯ�����꼶����ҳ
	 * */
	public Pager findAll();
	
	
	public List<TabGrade> findGrade();

	
	
	/**
	 * �����꼶
	 * @param g
	 */
	public void save(TabGrade g);
	
	/**
	 * �޸��꼶
	 * @param g
	 */
	public void update(TabGrade g);
	
	/**
	 * �����꼶��Ż�ȡ�꼶����
	 * @param id
	 * @return
	 */
	public TabGrade findById(int id);
	
	
	
	
	

}
