package com.aaa.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.aaa.entity.Houseinfo;
import com.aaa.entity.Pager;
import com.aaa.util.HibernateSessionFactory;

public class HouseDaoImpl implements HouseDao {

	@Override
	public void save(Houseinfo info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tr=session.beginTransaction();
		try {
			session.save(info);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}finally {
			HibernateSessionFactory.closeSession();
		}

	}

	@Override
	public List<Houseinfo> query(Houseinfo info,double min,double max) {
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Houseinfo h where 1=1 ";
		Map map=new HashMap();//存储参数
		if(info!=null){
			//标题
			if(info.getTitle()!=null&&!info.getTitle().equals("")){
				hql+=" and h.title like :title ";
				map.put("title", "%"+info.getTitle()+"%");
			}
			//联系人
			if(info.getLinkman()!=null&&!info.getLinkman().equals("")){
				hql+=" and h.linkman like :linkman ";
				map.put("linkman", "%"+info.getLinkman()+"%");
			}
			//类型
			if(info.getHousetype()!=null&&info.getHousetype().getId()>0){
				hql+=" and h.housetype.id=:tid ";
				map.put("tid", info.getHousetype().getId());
			}
		}
		//价格
		if(max>min){
			hql+=" and price between :min and :max ";
			map.put("min", min);
			map.put("max", max);
		}
		Query query=session.createQuery(hql);
		query.setProperties(map);//传递参数
		List<Houseinfo> list=query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}

	@Override
	public List<Houseinfo> queryAll() {
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Houseinfo ";
		Query query=session.createQuery(hql);
		List<Houseinfo> list=query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}

	@Override
	public Houseinfo get(int id) {
		Session session=HibernateSessionFactory.getSession();
		Houseinfo info=session.get(Houseinfo.class, id);
		HibernateSessionFactory.closeSession();
		return info;
	}

	@Override
	public void delete(int id) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tr=session.beginTransaction();
		try {
			Houseinfo info=new Houseinfo();
			info.setId(id);
			session.delete(info);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public void update(Houseinfo info) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tr=session.beginTransaction();
		try {
			session.update(info);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Map> testJSON() {
		Session session=HibernateSessionFactory.getSession();
		//String hql="select new Map(h.id,h.title,h.housetype.tname) from Houseinfo h";
		String hql="select new Map(h.id as id ,h.title  as title,h.housetype.tname as tname) from Houseinfo h";
		Query query=session.createQuery(hql);
		List<Map> list= query.list();
		return list;
	}

	@Override
	public Pager queryByPages(int curPage,int pageSize) {
		Pager pager=new Pager();
		pager.setCurPage(curPage);//设置当前页
		pager.setPageSize(pageSize);//设定每页显示的数量
		Session session=HibernateSessionFactory.getSession();
		String hql=" from Houseinfo ";
		Query query=session.createQuery(hql);
		query.setFirstResult((pager.getCurPage()-1)*pager.getPageSize());
		query.setMaxResults(pager.getPageSize());
		pager.setDatas(query.list());//绑定数据
		hql=" select count(*) from Houseinfo h ";
		query=session.createQuery(hql);
		pager.setTotalRecords(Integer.valueOf(query.uniqueResult().toString()));
		HibernateSessionFactory.closeSession();
		return pager;
	}

}
