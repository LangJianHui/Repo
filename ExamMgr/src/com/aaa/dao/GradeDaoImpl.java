package com.aaa.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Pager;
import com.aaa.entity.TabGrade;
import com.aaa.util.PagerHelper;
@Repository
public class GradeDaoImpl implements GradeDao {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public Pager findAll(Pager pager) {
		String hql=" from TabGrade";//查询数据
		String hql1="select count(*) from TabGrade";//总数量
		//return template.find(hql);//获取list集合
	 	Pager p= template.execute(new PagerHelper<Pager>(hql, hql1, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}
	@Override
	public Pager findAll() {
		Pager p=new Pager();
		String hql=" from TabGrade";//查询数据
		p.setList(this.template.find(hql));
		return p;
	}
	

	@Override
	public void save(TabGrade g) {
		template.save(g);
	}

	@Override
	public void update(TabGrade g) {
		template.update(g);
	}

	@Override
	public TabGrade findById(int id) {
		return template.get(TabGrade.class, id);
	}
	@Override
	public List<TabGrade> findGrade() {
		String hql=" select new TabGrade(tabGradeId,gradeName) from TabGrade";
		return template.find(hql);
	}

	

}
