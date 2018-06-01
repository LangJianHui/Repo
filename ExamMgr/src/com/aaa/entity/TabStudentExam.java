package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabStudentExam entity. @author MyEclipse Persistence Tools
 */

public class TabStudentExam implements java.io.Serializable {

	// Fields

	private Integer tabStudentExamId;
	private TabStudent tabStudent;
	private TabExam tabExam;
	private Double examScore;
	private Set tabStudentExamAnswers = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabStudentExam() {
	}

	/** full constructor */
	public TabStudentExam(TabStudent tabStudent, TabExam tabExam, Double examScore, Set tabStudentExamAnswers) {
		this.tabStudent = tabStudent;
		this.tabExam = tabExam;
		this.examScore = examScore;
		this.tabStudentExamAnswers = tabStudentExamAnswers;
	}

	// Property accessors

	public Integer getTabStudentExamId() {
		return this.tabStudentExamId;
	}

	public void setTabStudentExamId(Integer tabStudentExamId) {
		this.tabStudentExamId = tabStudentExamId;
	}

	public TabStudent getTabStudent() {
		return this.tabStudent;
	}

	public void setTabStudent(TabStudent tabStudent) {
		this.tabStudent = tabStudent;
	}

	public TabExam getTabExam() {
		return this.tabExam;
	}

	public void setTabExam(TabExam tabExam) {
		this.tabExam = tabExam;
	}

	public Double getExamScore() {
		return this.examScore;
	}

	public void setExamScore(Double examScore) {
		this.examScore = examScore;
	}

	public Set getTabStudentExamAnswers() {
		return this.tabStudentExamAnswers;
	}

	public void setTabStudentExamAnswers(Set tabStudentExamAnswers) {
		this.tabStudentExamAnswers = tabStudentExamAnswers;
	}

}