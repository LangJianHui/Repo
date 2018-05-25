package com.aaa.dao.permission;

import java.util.List;

import com.aaa.entity.SysMenu;
import com.aaa.entity.TreeNode;

public interface MenuDao {
	public List<TreeNode> find(List<TreeNode> list, int pid);
	
}
