package com.aaa.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.aaa.entity.Pager;

public class PagerHelper<T> implements HibernateCallback<Pager> {
	
	//Ҫִ�е�����
	private String hql;
	//��ȡ������
	private String hql1;
	//��������
	private Object[] params;
	//��ǰҳ
	private int curPage;
	//ÿҳ����
	private int pageSize;
	
	/**
	 * ��ʼ����ҳ��صĲ���
	 * @param hql ��ѯ���ݵ�����
	 * @param hql1 ��ȡ������������
	 * @param params ��ѯʹ�õĲ������飬���û�� ��null
	 * @param curPage ��ǰҳ
	 * @param pageSize ÿҳ������
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
		//��ҳ
		Query query=session.createQuery(hql);
		setParams(query,params);//�󶨲���
		query.setFirstResult((curPage-1)*pageSize);//�趨��ʼ������
		query.setMaxResults(pageSize);//����ÿҳ��ʾ������
		//�õ���ҳ����
		Pager p=new Pager();
		p.setCurPage(curPage);
		p.setPageSize(pageSize);
		p.setList(query.list());//������
		//�ٴβ�ѯ�õ�����������������
		query= session.createQuery(hql1);
		setParams(query,params);//�󶨲���
		p.setTotalCount(Integer.parseInt(query.uniqueResult().toString()));//�趨������
		return p;
	}
	
	/**
	 * ��Query����󶨲���
	 * @param query  query����
	 * @param params ��������
	 */
	private void setParams(Query query,Object[] params){
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);//���Ӳ���
			}
		}
	}
	
	

}