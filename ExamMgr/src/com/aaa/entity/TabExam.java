package com.aaa.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TabExam entity. @author MyEclipse Persistence Tools
 */

public class TabExam implements java.io.Serializable {

	// Fields

	private Integer tabExamId;
	private TabGrade tabGrade;
	private String examName;
	private String examPerson;
	private Timestamp examCreateTime;
	private Timestamp examBeginTime;
	private Integer examPersonId;
	private String examState;
	private String examType;
	private Set tabStudentExams = new HashSet(0);
	private Set tabExamQuestions = new HashSet(0);
	private Set tabExamSubjects = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabExam() {
	}

	/** full constructor */
	public TabExam(TabGrade tabGrade, String examName, String examPerson, Timestamp examCreateTime,
			Timestamp examBeginTime, Integer examPersonId, String examState, String examType, Set tabStudentExams,
			Set tabExamQuestions, Set tabExamSubjects) {
		this.tabGrade = tabGrade;
		this.examName = examName;
		this.examPerson = examPerson;
		this.examCreateTime = examCreateTime;
		this.examBeginTime = examBeginTime;
		this.examPersonId = examPersonId;
		this.examState = examState;
		this.examType = examType;
		this.tabStudentExams = tabStudentExams;
		this.tabExamQuestions = tabExamQuestions;
		this.tabExamSubjects = tabExamSubjects;
	}

	// Property accessors

	public Integer getTabExamId() {
		return this.tabExamId;
	}

	public void setTabExamId(Integer tabExamId) {
		this.tabExamId = tabExamId;
	}

	public TabGrade getTabGrade() {
		return this.tabGrade;
	}

	public void setTabGrade(TabGrade tabGrade) {
		this.tabGrade = tabGrade;
	}

	public String getExamName() {
		return this.examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamPerson() {
		return this.examPerson;
	}

	public void setExamPerson(String examPerson) {
		this.examPerson = examPerson;
	}

	public Timestamp getExamCreateTime() {
		return this.examCreateTime;
	}

	public void setExamCreateTime(Timestamp examCreateTime) {
		this.examCreateTime = examCreateTime;
	}

	public Timestamp getExamBeginTime() {
		return this.examBeginTime;
	}

	public void setExamBeginTime(Timestamp examBeginTime) {
		this.examBeginTime = examBeginTime;
	}

	public Integer getExamPersonId() {
		return this.examPersonId;
	}

	public void setExamPersonId(Integer examPersonId) {
		this.examPersonId = examPersonId;
	}

	public String getExamState() {
		return this.examState;
	}

	public void setExamState(String examState) {
		this.examState = examState;
	}

	public String getExamType() {
		return this.examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public Set getTabStudentExams() {
		return this.tabStudentExams;
	}

	public void setTabStudentExams(Set tabStudentExams) {
		this.tabStudentExams = tabStudentExams;
	}

	public Set getTabExamQuestions() {
		return this.tabExamQuestions;
	}

	public void setTabExamQuestions(Set tabExamQuestions) {
		this.tabExamQuestions = tabExamQuestions;
	}

	public Set getTabExamSubjects() {
		return this.tabExamSubjects;
	}

	public void setTabExamSubjects(Set tabExamSubjects) {
		this.tabExamSubjects = tabExamSubjects;
	}

}