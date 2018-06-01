package com.aaa.entity;

/**
 * TabRoleFunction entity. @author MyEclipse Persistence Tools
 */

public class TabRoleFunction implements java.io.Serializable {

	// Fields

	private Integer tabFuncitonRoleId;
	private TabRole tabRole;
	private TabFunction tabFunction;

	// Constructors

	/** default constructor */
	public TabRoleFunction() {
	}

	/** full constructor */
	public TabRoleFunction(TabRole tabRole, TabFunction tabFunction) {
		this.tabRole = tabRole;
		this.tabFunction = tabFunction;
	}

	// Property accessors

	public Integer getTabFuncitonRoleId() {
		return this.tabFuncitonRoleId;
	}

	public void setTabFuncitonRoleId(Integer tabFuncitonRoleId) {
		this.tabFuncitonRoleId = tabFuncitonRoleId;
	}

	public TabRole getTabRole() {
		return this.tabRole;
	}

	public void setTabRole(TabRole tabRole) {
		this.tabRole = tabRole;
	}

	public TabFunction getTabFunction() {
		return this.tabFunction;
	}

	public void setTabFunction(TabFunction tabFunction) {
		this.tabFunction = tabFunction;
	}

}