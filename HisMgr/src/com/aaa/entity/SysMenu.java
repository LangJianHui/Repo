package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SysMenu entity. @author MyEclipse Persistence Tools
 */

public class SysMenu implements java.io.Serializable {

	// Fields

	private Integer menuId;
	private String menuUrl;
	private String menuName;
	private String menuCode;
	private Integer menuParentId;
	private Integer menuOrder;
	private String menuType;
	private Date createTime;
	private Set sysRoleMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysMenu() {
	}

	/** full constructor */
	public SysMenu(String menuUrl, String menuName, String menuCode, Integer menuParentId, Integer menuOrder,
			String menuType, Date createTime, Set sysRoleMenus) {
		this.menuUrl = menuUrl;
		this.menuName = menuName;
		this.menuCode = menuCode;
		this.menuParentId = menuParentId;
		this.menuOrder = menuOrder;
		this.menuType = menuType;
		this.createTime = createTime;
		this.sysRoleMenus = sysRoleMenus;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public Integer getMenuParentId() {
		return this.menuParentId;
	}

	public void setMenuParentId(Integer menuParentId) {
		this.menuParentId = menuParentId;
	}

	public Integer getMenuOrder() {
		return this.menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Set getSysRoleMenus() {
		return this.sysRoleMenus;
	}

	public void setSysRoleMenus(Set sysRoleMenus) {
		this.sysRoleMenus = sysRoleMenus;
	}

}