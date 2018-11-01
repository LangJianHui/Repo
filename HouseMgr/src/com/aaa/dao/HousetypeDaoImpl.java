package com.aaa.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.aaa.entity.Housetype;
import com.aaa.util.HibernateSessionFactory;

public class HousetypeDaoImpl implements HousetypeDao {

	@Override
	public List<Housetype> queryAll() {
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Housetype ";
		Query query=session.createQuery(hql);
		List<Housetype> list=query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}

}
