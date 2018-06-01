package com.aaa.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.aaa.entity.Pager;

public class PagerHelper<T> implements HibernateCallback<Pager> {
	
	//要执行的命令
	private String hql;
	//获取总数量
	private String hql1;
	//参数数组
	private Object[] params;
	//当前页
	private int curPage;
	//每页数量
	private int pageSize;
	
	/**
	 * 初始化分页相关的参数
	 * @param hql 查询数据的命令
	 * @param hql1 获取总数量的命令
	 * @param params 查询使用的参数数组，如果没有 就null
	 * @param curPage 当前页
	 * @param pageSize 每页的条数
	 */
	public PagerHelper(String hql,String hql1, Object[] params, int curPage, int pageSize) {
		super();
		this.hql = hql;
		this.hql1=hql1;
		this.params = params;
		this.curPage = curPage;
		this.pageSize = pageSize;
	}

	@Override
	public Pager doInHibernate(Session session) throws HibernateException, SQLException {
		//分页
		Query query=session.createQuery(hql);
		setParams(query,params);//绑定参数
		query.setFirstResult((curPage-1)*pageSize);//设定起始行索引
		query.setMaxResults(pageSize);//设置每页显示的行数
		//得到分页对象
		Pager p=new Pager();
		p.setCurPage(curPage);
		p.setPageSize(pageSize);
		p.setList(query.list());//绑定数据
		//再次查询得到满足条件的总数量
		query= session.createQuery(hql1);
		setParams(query,params);//绑定参数
		p.setTotalCount(Integer.parseInt(query.uniqueResult().toString()));//设定总数量
		return p;
	}
	
	/**
	 * 给Query对象绑定参数
	 * @param query  query对象
	 * @param params 参数集合
	 */
	private void setParams(Query query,Object[] params){
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);//添加参数
			}
		}
	}
	
	

}
