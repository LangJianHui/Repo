package com.aaa.service;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;

public interface GradeService {
	/**
	 * ��ѯ�����꼶
	 * @return
	 */
	public Pager findAll(Pager pager);
	
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
	
	public List<TabGrade> findGrade();
	
	
}
