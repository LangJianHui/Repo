package com.aaa.dao.permission;

import java.util.List;

import com.aaa.entity.SysMenu;
import com.aaa.entity.TreeNode;

public interface MenuDao {
	/**
	 * 查找所有节点
	 * @param list 树形节点集合
	 * @param pid 父级id
	 * @return 属性菜单集合
	 */
	public List<TreeNode> find(List<TreeNode> list, int pid);
	
}
