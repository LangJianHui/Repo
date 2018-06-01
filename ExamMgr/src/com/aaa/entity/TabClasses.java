package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabClasses entity. @author MyEclipse Persistence Tools
 */

public class TabClasses implements java.io.Serializable {

	// Fields

	private Integer tabClassesId;
	private TabGrade tabGrade;
	private String classesName;
	private Integer classTeacherId;
	private Set tabStudents = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabClasses() {
	}

	/** full constructor */
	public TabClasses(TabGrade tabGrade, String classesName, Integer classTeacherId, Set tabStudents) {
		this.tabGrade = tabGrade;
		this.classesName = classesName;
		this.classTeacherId = classTeacherId;
		this.tabStudents = tabStudents;
	}

	// Property accessors

	public Integer getTabClassesId() {
		return this.tabClassesId;
	}

	public void setTabClassesId(Integer tabClassesId) {
		this.tabClassesId = tabClassesId;
	}

	public TabGrade getTabGrade() {
		return this.tabGrade;
	}

	public void setTabGrade(TabGrade tabGrade) {
		this.tabGrade = tabGrade;
	}

	public String getClassesName() {
		return this.classesName;
	}

	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}

	public Integer getClassTeacherId() {
		return this.classTeacherId;
	}

	public void setClassTeacherId(Integer classTeacherId) {
		this.classTeacherId = classTeacherId;
	}

	public Set getTabStudents() {
		return this.tabStudents;
	}

	public void setTabStudents(Set tabStudents) {
		this.tabStudents = tabStudents;
	}

}