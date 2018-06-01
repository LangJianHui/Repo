package com.aaa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Pager;
import com.aaa.entity.TabSubject;

@Repository
public class SubjectDaoImpl implements SubjectDao {

	@Autowired //默认按类型自动注入
	private HibernateTemplate template;
	
	@Override
	public Pager findAll(Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TabSubject s) {
		template.save(s);
	}

	@Override
	public void update(TabSubject s) {
		// TODO Auto-generated method stub

	}

	@Override
	public TabSubject findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
