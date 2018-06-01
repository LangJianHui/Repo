package com.aaa.entity;

/**
 * TabExamSubject entity. @author MyEclipse Persistence Tools
 */

public class TabExamSubject implements java.io.Serializable {

	// Fields

	private Integer tabExamSubjectId;
	private TabExam tabExam;
	private TabSubject tabSubject;
	private Integer examSubjectSum;

	// Constructors

	/** default constructor */
	public TabExamSubject() {
	}

	/** full constructor */
	public TabExamSubject(TabExam tabExam, TabSubject tabSubject, Integer examSubjectSum) {
		this.tabExam = tabExam;
		this.tabSubject = tabSubject;
		this.examSubjectSum = examSubjectSum;
	}

	// Property accessors

	public Integer getTabExamSubjectId() {
		return this.tabExamSubjectId;
	}

	public void setTabExamSubjectId(Integer tabExamSubjectId) {
		this.tabExamSubjectId = tabExamSubjectId;
	}

	public TabExam getTabExam() {
		return this.tabExam;
	}

	public void setTabExam(TabExam tabExam) {
		this.tabExam = tabExam;
	}

	public TabSubject getTabSubject() {
		return this.tabSubject;
	}

	public void setTabSubject(TabSubject tabSubject) {
		this.tabSubject = tabSubject;
	}

	public Integer getExamSubjectSum() {
		return this.examSubjectSum;
	}

	public void setExamSubjectSum(Integer examSubjectSum) {
		this.examSubjectSum = examSubjectSum;
	}

}