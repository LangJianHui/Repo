package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabGrade entity. @author MyEclipse Persistence Tools
 */

public class TabGrade implements java.io.Serializable {

	// Fields

	private Integer tabGradeId;
	private String gradeName;
	private Set tabSubjects = new HashSet(0);
	private Set tabExams = new HashSet(0);
	private Set tabClasseses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabGrade() {
	}

	/** full constructor */
	public TabGrade(String gradeName, Set tabSubjects, Set tabExams, Set tabClasseses) {
		this.gradeName = gradeName;
		this.tabSubjects = tabSubjects;
		this.tabExams = tabExams;
		this.tabClasseses = tabClasseses;
	}

	// Property accessors

	public Integer getTabGradeId() {
		return this.tabGradeId;
	}

	public void setTabGradeId(Integer tabGradeId) {
		this.tabGradeId = tabGradeId;
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Set getTabSubjects() {
		return this.tabSubjects;
	}

	public void setTabSubjects(Set tabSubjects) {
		this.tabSubjects = tabSubjects;
	}

	public Set getTabExams() {
		return this.tabExams;
	}

	public void setTabExams(Set tabExams) {
		this.tabExams = tabExams;
	}

	public Set getTabClasseses() {
		return this.tabClasseses;
	}

	public void setTabClasseses(Set tabClasseses) {
		this.tabClasseses = tabClasseses;
	}

	public TabGrade(Integer tabGradeId, String gradeName) {
		super();
		this.tabGradeId = tabGradeId;
		this.gradeName = gradeName;
	}
	
	

}