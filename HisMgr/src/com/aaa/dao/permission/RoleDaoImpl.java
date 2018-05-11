package com.aaa.dao.permission;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.aaa.entity.Pager;
import com.aaa.entity.SysRole;
import com.aaa.util.PageCallBack;
import com.aaa.util.PagerCallBack2;

public class RoleDaoImpl implements RoleDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void save(SysRole role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(SysRole role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SysRole role) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pager findByPages(int curPage, int pageSize) {
		String hql=" from SysRole ";
		String hql1="select count(*) from SysRole";
		Pager p=this.getTemplate().execute(new PagerCallBack2(hql, hql1, null, curPage, pageSize));
		return p;
	}

}
