package com.aaa.dao.permission;

import java.util.List;

import com.aaa.entity.SysMenu;
import com.aaa.entity.TreeNode;

public interface MenuDao {
	/**
	 * �������нڵ�
	 * @param list ���νڵ㼯��
	 * @param pid ����id
	 * @return ���Բ˵�����
	 */
	public List<TreeNode> find(List<TreeNode> list, int pid);
	
}
