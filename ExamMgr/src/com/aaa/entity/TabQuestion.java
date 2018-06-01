package com.aaa.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TabQuestion entity. @author MyEclipse Persistence Tools
 */

public class TabQuestion implements java.io.Serializable {

	// Fields

	private Integer tabQuestionId;
	private TabSubject tabSubject;
	private String questionName;
	private String questionInfo;
	private String questionAnswer;
	private String questionCreatePerson;
	private Timestamp questionCreateTime;
	private String questionState;
	private Integer questionCreatePersonId;
	private String questionType;
	private Set tabExamQuestions = new HashSet(0);
	private Set tabOptions = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabQuestion() {
	}

	/** full constructor */
	public TabQuestion(TabSubject tabSubject, String questionName, String questionInfo, String questionAnswer,
			String questionCreatePerson, Timestamp questionCreateTime, String questionState,
			Integer questionCreatePersonId, String questionType, Set tabExamQuestions, Set tabOptions) {
		this.tabSubject = tabSubject;
		this.questionName = questionName;
		this.questionInfo = questionInfo;
		this.questionAnswer = questionAnswer;
		this.questionCreatePerson = questionCreatePerson;
		this.questionCreateTime = questionCreateTime;
		this.questionState = questionState;
		this.questionCreatePersonId = questionCreatePersonId;
		this.questionType = questionType;
		this.tabExamQuestions = tabExamQuestions;
		this.tabOptions = tabOptions;
	}

	// Property accessors

	public Integer getTabQuestionId() {
		return this.tabQuestionId;
	}

	public void setTabQuestionId(Integer tabQuestionId) {
		this.tabQuestionId = tabQuestionId;
	}

	public TabSubject getTabSubject() {
		return this.tabSubject;
	}

	public void setTabSubject(TabSubject tabSubject) {
		this.tabSubject = tabSubject;
	}

	public String getQuestionName() {
		return this.questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getQuestionInfo() {
		return this.questionInfo;
	}

	public void setQuestionInfo(String questionInfo) {
		this.questionInfo = questionInfo;
	}

	public String getQuestionAnswer() {
		return this.questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public String getQuestionCreatePerson() {
		return this.questionCreatePerson;
	}

	public void setQuestionCreatePerson(String questionCreatePerson) {
		this.questionCreatePerson = questionCreatePerson;
	}

	public Timestamp getQuestionCreateTime() {
		return this.questionCreateTime;
	}

	public void setQuestionCreateTime(Timestamp questionCreateTime) {
		this.questionCreateTime = questionCreateTime;
	}

	public String getQuestionState() {
		return this.questionState;
	}

	public void setQuestionState(String questionState) {
		this.questionState = questionState;
	}

	public Integer getQuestionCreatePersonId() {
		return this.questionCreatePersonId;
	}

	public void setQuestionCreatePersonId(Integer questionCreatePersonId) {
		this.questionCreatePersonId = questionCreatePersonId;
	}

	public String getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public Set getTabExamQuestions() {
		return this.tabExamQuestions;
	}

	public void setTabExamQuestions(Set tabExamQuestions) {
		this.tabExamQuestions = tabExamQuestions;
	}

	public Set getTabOptions() {
		return this.tabOptions;
	}

	public void setTabOptions(Set tabOptions) {
		this.tabOptions = tabOptions;
	}

}