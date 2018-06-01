package com.aaa.entity;

/**
 * TabUserRole entity. @author MyEclipse Persistence Tools
 */

public class TabUserRole implements java.io.Serializable {

	// Fields

	private Integer tabUserRoleId;
	private TabRole tabRole;
	private TabUser tabUser;

	// Constructors

	/** default constructor */
	public TabUserRole() {
	}

	/** full constructor */
	public TabUserRole(TabRole tabRole, TabUser tabUser) {
		this.tabRole = tabRole;
		this.tabUser = tabUser;
	}

	// Property accessors

	public Integer getTabUserRoleId() {
		return this.tabUserRoleId;
	}

	public void setTabUserRoleId(Integer tabUserRoleId) {
		this.tabUserRoleId = tabUserRoleId;
	}

	public TabRole getTabRole() {
		return this.tabRole;
	}

	public void setTabRole(TabRole tabRole) {
		this.tabRole = tabRole;
	}

	public TabUser getTabUser() {
		return this.tabUser;
	}

	public void setTabUser(TabUser tabUser) {
		this.tabUser = tabUser;
	}

}