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
	 * ���Խ���������ѯ�ͷ�ҳ
	 * @param pager ��ҳʵ��
	 * @param params ��������
	 * @return ��ҳʵ��
	 */
	public Pager findAll(Pager pager,Object... params);
	
	
	//��ɫȨ��
	//��ѯ���в˵������ȡ����Ӧ��ɫ��ŵĲ˵�
	public List findAllMenusByRoleId(int roleId);
	//����ɫ�˵��м���в�������
	public void insertMenusForRole(SysRoleMenu roleMenu);
	//ɾ���м����ָ����ɫid��Ӧ������
	public void deleteMenusForRole(int roleId);
}
