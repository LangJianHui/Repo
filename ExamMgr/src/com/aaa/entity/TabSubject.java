package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabSubject entity. @author MyEclipse Persistence Tools
 */

public class TabSubject implements java.io.Serializable {

	// Fields

	private Integer tabSubjectId;
	private TabGrade tabGrade;
	private String subjectName;
	private String subjectInfo;
	private Integer subjectQuestionSum;
	private Set tabQuestions = new HashSet(0);
	private Set tabExamSubjects = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabSubject() {
	}

	/** full constructor */
	public TabSubject(TabGrade tabGrade, String subjectName, String subjectInfo, Integer subjectQuestionSum,
			Set tabQuestions, Set tabExamSubjects) {
		this.tabGrade = tabGrade;
		this.subjectName = subjectName;
		this.subjectInfo = subjectInfo;
		this.subjectQuestionSum = subjectQuestionSum;
		this.tabQuestions = tabQuestions;
		this.tabExamSubjects = tabExamSubjects;
	}

	// Property accessors

	public Integer getTabSubjectId() {
		return this.tabSubjectId;
	}

	public void setTabSubjectId(Integer tabSubjectId) {
		this.tabSubjectId = tabSubjectId;
	}

	public TabGrade getTabGrade() {
		return this.tabGrade;
	}

	public void setTabGrade(TabGrade tabGrade) {
		this.tabGrade = tabGrade;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectInfo() {
		return this.subjectInfo;
	}

	public void setSubjectInfo(String subjectInfo) {
		this.subjectInfo = subjectInfo;
	}

	public Integer getSubjectQuestionSum() {
		return this.subjectQuestionSum;
	}

	public void setSubjectQuestionSum(Integer subjectQuestionSum) {
		this.subjectQuestionSum = subjectQuestionSum;
	}

	public Set getTabQuestions() {
		return this.tabQuestions;
	}

	public void setTabQuestions(Set tabQuestions) {
		this.tabQuestions = tabQuestions;
	}

	public Set getTabExamSubjects() {
		return this.tabExamSubjects;
	}

	public void setTabExamSubjects(Set tabExamSubjects) {
		this.tabExamSubjects = tabExamSubjects;
	}

}