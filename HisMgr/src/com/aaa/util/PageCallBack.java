package com.aaa.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.aaa.entity.Pager;

public class PageCallBack<T> implements HibernateCallback<List<T>> {
	
	//Ҫִ�е�����
	private String hql;
	//��������
	private Object[] params;
	//��ǰҳ
	private int curPage;
	//ÿҳ����
	private int pageSize;
	
	
	public PageCallBack(String hql, Object[] params, int curPage, int pageSize) {
		super();
		this.hql = hql;
		this.params = params;
		this.curPage = curPage;
		this.pageSize = pageSize;
	}

	@Override
	public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
		//��ҳ
		Query query=session.createQuery(hql);
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);//��Ӳ���
			}
		}
		query.setFirstResult((curPage-1)*pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}
	
	

}
