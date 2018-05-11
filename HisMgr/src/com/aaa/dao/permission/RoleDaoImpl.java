package com.aaa.dao.permission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Pager;
import com.aaa.entity.SysRole;
import com.aaa.util.PageCallBack;
import com.aaa.util.PagerHelper;

@Repository
public class RoleDaoImpl implements RoleDao {
	@Autowired
	private HibernateTemplate template;

	

	@Override
	public void save(SysRole role) {
		this.template.save(role);

	}

	@Override
	public void update(SysRole role) {
		this.template.update(role);

	}

	@Override
	public void delete(SysRole role) {
		

	}

	@Override
	public Pager findByPages(Pager pager) {
		String hql="select new Map(roleId as id,roleName as name,description as desc) from SysRole ";
		String hql1="select count(*) from SysRole";
		Pager p=this.template.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}



	@Override
	public boolean isExists(String roleName) {
		String hql="select count(*) from SysRole where roleName=?";
		int count= Integer.parseInt( this.template.find(hql,roleName).get(0).toString());
		return count>0?true:false;
	}

}
