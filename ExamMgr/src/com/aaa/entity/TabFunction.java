package com.aaa.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TabFunction entity. @author MyEclipse Persistence Tools
 */

public class TabFunction implements java.io.Serializable {

	// Fields

	private Integer tabFunctionId;
	private String functionName;
	private String functionInfo;
	private String url;
	private Timestamp createTime;
	private String createPerson;
	private String createPersonId;
	private Integer parentFunctionId;
	private Set tabRoleFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabFunction() {
	}

	/** full constructor */
	public TabFunction(String functionName, String functionInfo, String url, Timestamp createTime, String createPerson,
			String createPersonId, Integer parentFunctionId, Set tabRoleFunctions) {
		this.functionName = functionName;
		this.functionInfo = functionInfo;
		this.url = url;
		this.createTime = createTime;
		this.createPerson = createPerson;
		this.createPersonId = createPersonId;
		this.parentFunctionId = parentFunctionId;
		this.tabRoleFunctions = tabRoleFunctions;
	}

	// Property accessors

	public Integer getTabFunctionId() {
		return this.tabFunctionId;
	}

	public void setTabFunctionId(Integer tabFunctionId) {
		this.tabFunctionId = tabFunctionId;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionInfo() {
		return this.functionInfo;
	}

	public void setFunctionInfo(String functionInfo) {
		this.functionInfo = functionInfo;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCreatePerson() {
		return this.createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public String getCreatePersonId() {
		return this.createPersonId;
	}

	public void setCreatePersonId(String createPersonId) {
		this.createPersonId = createPersonId;
	}

	public Integer getParentFunctionId() {
		return this.parentFunctionId;
	}

	public void setParentFunctionId(Integer parentFunctionId) {
		this.parentFunctionId = parentFunctionId;
	}

	public Set getTabRoleFunctions() {
		return this.tabRoleFunctions;
	}

	public void setTabRoleFunctions(Set tabRoleFunctions) {
		this.tabRoleFunctions = tabRoleFunctions;
	}

}