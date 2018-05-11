package com.aaa.entity;

/**
 * SysRoleMenu entity. @author MyEclipse Persistence Tools
 */

public class SysRoleMenu implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysRole sysRole;
	private SysMenu sysMenu;

	// Constructors

	/** default constructor */
	public SysRoleMenu() {
	}

	/** full constructor */
	public SysRoleMenu(SysRole sysRole, SysMenu sysMenu) {
		this.sysRole = sysRole;
		this.sysMenu = sysMenu;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SysRole getSysRole() {
		return this.sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	public SysMenu getSysMenu() {
		return this.sysMenu;
	}

	public void setSysMenu(SysMenu sysMenu) {
		this.sysMenu = sysMenu;
	}

}