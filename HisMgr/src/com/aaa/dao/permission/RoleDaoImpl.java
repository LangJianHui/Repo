package com.aaa.dao.permission;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Pager;
import com.aaa.entity.SysMenu;
import com.aaa.entity.SysRole;
import com.aaa.entity.SysRoleMenu;
import com.aaa.entity.TreeNode;
import com.aaa.util.PageCallBack;
import com.aaa.util.PagerHelper;
import com.aaa.util.Util;



@Repository
public class RoleDaoImpl implements RoleDao {
	@Autowired
	private HibernateTemplate template;
	@Override
	public void delete(SysRole role) {
		this.template.delete(role);
	}

	@Override
	public Pager findByPages(Pager pager) {
		String hql="select new Map(roleId as roleId ,roleName as roleName,description as description) from SysRole ";
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

	@Override
	public Map findById(int id) {
		String hql="select new Map(roleId as roleId,roleName as roleName,description as description) from SysRole where roleId=? ";
		return (Map)this.template.find(hql,id).get(0);
	}

	@Override
	public void save(SysRole role) {
		this.template.save(role);
	}

	@Override
	public void update(SysRole role) {
		this.template.update(role);
	}

	@Override
	public List findAllMenusByRoleId(int roleId) {
		//本地sql查询
		final String sql="select m.menu_id,menu_parent_id,menu_name,1 as open, "
				+ "(case when role_id is not null then true else false end) as checked "
				+ "from sys_menu m left join "
				+ "(select * from sys_role_menu rm where rm.role_id=?) as rm "
				+ "on m.menu_id=rm.menu_id";
		final Object[] params=new Object[]{roleId};
		List list= this.template.execute(new HibernateCallback<List>() {
			@Override
			public List<Map> doInHibernate(Session session) throws HibernateException, SQLException {
				Query query= session.createSQLQuery(sql);
				query.setParameter(0, params[0]);
				//设定结果集中每个对象为Map类型
				query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
				List list=query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public void insertMenusForRole(SysRoleMenu roleMenu) {
		this.template.save(roleMenu);
	}

	@Override
	public void deleteMenusForRole(int roleId) {
		String hql="delete from SysRoleMenu where sysRole.roleId="+roleId;
		this.template.bulkUpdate(hql);//批量更新
		
	}

	@Override
	public Pager findAll(Pager pager, Object... params) {
		
		String strWhere=" where roleName like ? ";//查询条件
		String hql="select new Map(roleId as roleId ,roleName as roleName,description as description) from SysRole ";
		String hql1="select count(*) from SysRole " ;
		if(params!=null&&params.length>0){//如果参数不为空，绑定查询条件
			hql+=strWhere;
			hql1+=strWhere;
		}
		Pager p=this.template.execute(new PagerHelper(hql, hql1, params, pager.getCurPage(), pager.getPageSize()));
		return p;
	}

	

}
