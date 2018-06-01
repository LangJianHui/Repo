package com.aaa.service;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.entity.TabSubject;

public interface SubjectService {
	/**
	 * ��ѯ����
	 * @return
	 */
	public Pager findAll(Pager pager);
	
	/**
	 * ����
	 * @param g
	 */
	public void save(TabSubject s);
	
	/**
	 * �޸�
	 * @param g
	 */
	public void update(TabSubject s);
	
	/**
	 * ���ݱ�Ż�ȡ����
	 * @param id
	 * @return
	 */
	public TabSubject findById(int id);
}
