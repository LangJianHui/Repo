package com.aaa.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TabExamQuestion entity. @author MyEclipse Persistence Tools
 */

public class TabExamQuestion implements java.io.Serializable {

	// Fields

	private Integer tabExamQuestionId;
	private TabExam tabExam;
	private TabQuestion tabQuestion;
	private String questionNameBack;
	private String questionInfoBack;
	private String questionAnswerBack;
	private String questionCreatePersonBack;
	private Timestamp questionCreateTimeBack;
	private String questionStateBack;
	private Integer questionCreatePersonIdBack;
	private String questionTypeBack;
	private Set tabStudentExamAnswers = new HashSet(0);
	private Set tabOptionBacks = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabExamQuestion() {
	}

	/** full constructor */
	public TabExamQuestion(TabExam tabExam, TabQuestion tabQuestion, String questionNameBack, String questionInfoBack,
			String questionAnswerBack, String questionCreatePersonBack, Timestamp questionCreateTimeBack,
			String questionStateBack, Integer questionCreatePersonIdBack, String questionTypeBack,
			Set tabStudentExamAnswers, Set tabOptionBacks) {
		this.tabExam = tabExam;
		this.tabQuestion = tabQuestion;
		this.questionNameBack = questionNameBack;
		this.questionInfoBack = questionInfoBack;
		this.questionAnswerBack = questionAnswerBack;
		this.questionCreatePersonBack = questionCreatePersonBack;
		this.questionCreateTimeBack = questionCreateTimeBack;
		this.questionStateBack = questionStateBack;
		this.questionCreatePersonIdBack = questionCreatePersonIdBack;
		this.questionTypeBack = questionTypeBack;
		this.tabStudentExamAnswers = tabStudentExamAnswers;
		this.tabOptionBacks = tabOptionBacks;
	}

	// Property accessors

	public Integer getTabExamQuestionId() {
		return this.tabExamQuestionId;
	}

	public void setTabExamQuestionId(Integer tabExamQuestionId) {
		this.tabExamQuestionId = tabExamQuestionId;
	}

	public TabExam getTabExam() {
		return this.tabExam;
	}

	public void setTabExam(TabExam tabExam) {
		this.tabExam = tabExam;
	}

	public TabQuestion getTabQuestion() {
		return this.tabQuestion;
	}

	public void setTabQuestion(TabQuestion tabQuestion) {
		this.tabQuestion = tabQuestion;
	}

	public String getQuestionNameBack() {
		return this.questionNameBack;
	}

	public void setQuestionNameBack(String questionNameBack) {
		this.questionNameBack = questionNameBack;
	}

	public String getQuestionInfoBack() {
		return this.questionInfoBack;
	}

	public void setQuestionInfoBack(String questionInfoBack) {
		this.questionInfoBack = questionInfoBack;
	}

	public String getQuestionAnswerBack() {
		return this.questionAnswerBack;
	}

	public void setQuestionAnswerBack(String questionAnswerBack) {
		this.questionAnswerBack = questionAnswerBack;
	}

	public String getQuestionCreatePersonBack() {
		return this.questionCreatePersonBack;
	}

	public void setQuestionCreatePersonBack(String questionCreatePersonBack) {
		this.questionCreatePersonBack = questionCreatePersonBack;
	}

	public Timestamp getQuestionCreateTimeBack() {
		return this.questionCreateTimeBack;
	}

	public void setQuestionCreateTimeBack(Timestamp questionCreateTimeBack) {
		this.questionCreateTimeBack = questionCreateTimeBack;
	}

	public String getQuestionStateBack() {
		return this.questionStateBack;
	}

	public void setQuestionStateBack(String questionStateBack) {
		this.questionStateBack = questionStateBack;
	}

	public Integer getQuestionCreatePersonIdBack() {
		return this.questionCreatePersonIdBack;
	}

	public void setQuestionCreatePersonIdBack(Integer questionCreatePersonIdBack) {
		this.questionCreatePersonIdBack = questionCreatePersonIdBack;
	}

	public String getQuestionTypeBack() {
		return this.questionTypeBack;
	}

	public void setQuestionTypeBack(String questionTypeBack) {
		this.questionTypeBack = questionTypeBack;
	}

	public Set getTabStudentExamAnswers() {
		return this.tabStudentExamAnswers;
	}

	public void setTabStudentExamAnswers(Set tabStudentExamAnswers) {
		this.tabStudentExamAnswers = tabStudentExamAnswers;
	}

	public Set getTabOptionBacks() {
		return this.tabOptionBacks;
	}

	public void setTabOptionBacks(Set tabOptionBacks) {
		this.tabOptionBacks = tabOptionBacks;
	}

}