package com.aaa.dao.permission;

import java.util.List;

import com.aaa.entity.Pager;
import com.aaa.entity.SysRole;

public interface RoleDao {
	public void save(SysRole role);
	public void update(SysRole  role);
	public void delete(SysRole role);
	public Pager findByPages(Pager pager);
	public boolean isExists(String roleName);
	
}
