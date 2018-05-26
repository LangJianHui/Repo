package com.aaa.dao.permission;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Pager;
import com.aaa.entity.SysMenu;
import com.aaa.entity.SysRole;
import com.aaa.entity.SysRoleMenu;
import com.aaa.entity.TreeNode;

public interface RoleDao {
	public void save(SysRole role);
	public void update(SysRole  role);
	public void delete(SysRole role);
	public Map findById(int id);
	public Pager findByPages(Pager pager);
	public boolean isExists(String roleName);
	/**
	 * 可以进行条件查询和分页
	 * @param pager 分页实体
	 * @param params 条件参数
	 * @return 分页实体
	 */
	public Pager findAll(Pager pager,Object... params);
	
	
	//角色权限
	//查询所有菜单项，并获取到对应角色编号的菜单
	public List findAllMenusByRoleId(int roleId);
	//往角色菜单中间表中插入数据
	public void insertMenusForRole(SysRoleMenu roleMenu);
	//删除中间表中指定角色id对应的数据
	public void deleteMenusForRole(int roleId);
}
