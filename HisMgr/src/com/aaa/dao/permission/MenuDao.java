package com.aaa.dao.permission;

import java.util.List;

import com.aaa.entity.SysMenu;

public interface MenuDao {
	public List findByRoleId(String roleNum);
	public void updateRoleMenu(String roleNum,List<SysMenu> menus);
	
}
