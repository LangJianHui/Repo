package com.aaa.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.aaa.entity.Pager;

public class PageCallBack<T> implements HibernateCallback<List<T>> {
	
	//要执行的命令
	private String hql;
	//参数数组
	private Object[] params;
	//当前页
	private int curPage;
	//每页数量
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
		//分页
		Query query=session.createQuery(hql);
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);//添加参数
			}
		}
		query.setFirstResult((curPage-1)*pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}
	
	

}
