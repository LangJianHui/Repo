package com.aaa.entity;

/**
 * TabStudentExamAnswer entity. @author MyEclipse Persistence Tools
 */

public class TabStudentExamAnswer implements java.io.Serializable {

	// Fields

	private Integer tabStudentExamAnswerId;
	private TabExamQuestion tabExamQuestion;
	private TabStudentExam tabStudentExam;
	private Integer studentId;
	private String questionAnswerId;

	// Constructors

	/** default constructor */
	public TabStudentExamAnswer() {
	}

	/** full constructor */
	public TabStudentExamAnswer(TabExamQuestion tabExamQuestion, TabStudentExam tabStudentExam, Integer studentId,
			String questionAnswerId) {
		this.tabExamQuestion = tabExamQuestion;
		this.tabStudentExam = tabStudentExam;
		this.studentId = studentId;
		this.questionAnswerId = questionAnswerId;
	}

	// Property accessors

	public Integer getTabStudentExamAnswerId() {
		return this.tabStudentExamAnswerId;
	}

	public void setTabStudentExamAnswerId(Integer tabStudentExamAnswerId) {
		this.tabStudentExamAnswerId = tabStudentExamAnswerId;
	}

	public TabExamQuestion getTabExamQuestion() {
		return this.tabExamQuestion;
	}

	public void setTabExamQuestion(TabExamQuestion tabExamQuestion) {
		this.tabExamQuestion = tabExamQuestion;
	}

	public TabStudentExam getTabStudentExam() {
		return this.tabStudentExam;
	}

	public void setTabStudentExam(TabStudentExam tabStudentExam) {
		this.tabStudentExam = tabStudentExam;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getQuestionAnswerId() {
		return this.questionAnswerId;
	}

	public void setQuestionAnswerId(String questionAnswerId) {
		this.questionAnswerId = questionAnswerId;
	}

}