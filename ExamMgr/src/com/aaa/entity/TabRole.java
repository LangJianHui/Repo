package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabRole entity. @author MyEclipse Persistence Tools
 */

public class TabRole implements java.io.Serializable {

	// Fields

	private Integer tabRoleId;
	private String roleName;
	private String roleCode;
	private String roleInfo;
	private Set tabUserRoles = new HashSet(0);
	private Set tabRoleFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabRole() {
	}

	/** full constructor */
	public TabRole(String roleName, String roleCode, String roleInfo, Set tabUserRoles, Set tabRoleFunctions) {
		this.roleName = roleName;
		this.roleCode = roleCode;
		this.roleInfo = roleInfo;
		this.tabUserRoles = tabUserRoles;
		this.tabRoleFunctions = tabRoleFunctions;
	}

	// Property accessors

	public Integer getTabRoleId() {
		return this.tabRoleId;
	}

	public void setTabRoleId(Integer tabRoleId) {
		this.tabRoleId = tabRoleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(String roleInfo) {
		this.roleInfo = roleInfo;
	}

	public Set getTabUserRoles() {
		return this.tabUserRoles;
	}

	public void setTabUserRoles(Set tabUserRoles) {
		this.tabUserRoles = tabUserRoles;
	}

	public Set getTabRoleFunctions() {
		return this.tabRoleFunctions;
	}

	public void setTabRoleFunctions(Set tabRoleFunctions) {
		this.tabRoleFunctions = tabRoleFunctions;
	}

}