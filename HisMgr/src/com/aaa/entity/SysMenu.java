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
	private String menuClass;
	private String menuCode;
	private String menuParentCode;
	private Integer menuOrder;
	private String menuType;
	private Date createTime;
	private Set sysRoleMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysMenu() {
	}

	/** full constructor */
	public SysMenu(String menuUrl, String menuClass, String menuCode, String menuParentCode, Integer menuOrder,
			String menuType, Date createTime, Set sysRoleMenus) {
		this.menuUrl = menuUrl;
		this.menuClass = menuClass;
		this.menuCode = menuCode;
		this.menuParentCode = menuParentCode;
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

	public String getMenuClass() {
		return this.menuClass;
	}

	public void setMenuClass(String menuClass) {
		this.menuClass = menuClass;
	}

	public String getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuParentCode() {
		return this.menuParentCode;
	}

	public void setMenuParentCode(String menuParentCode) {
		this.menuParentCode = menuParentCode;
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