package com.aaa.entity;

/**
 * TabOptionBack entity. @author MyEclipse Persistence Tools
 */

public class TabOptionBack implements java.io.Serializable {

	// Fields

	private Integer tabOptionIdBack;
	private TabExamQuestion tabExamQuestion;
	private TabOption tabOption;
	private String optionTextBack;
	private String optionValueBack;

	// Constructors

	/** default constructor */
	public TabOptionBack() {
	}

	/** full constructor */
	public TabOptionBack(TabExamQuestion tabExamQuestion, TabOption tabOption, String optionTextBack,
			String optionValueBack) {
		this.tabExamQuestion = tabExamQuestion;
		this.tabOption = tabOption;
		this.optionTextBack = optionTextBack;
		this.optionValueBack = optionValueBack;
	}

	// Property accessors

	public Integer getTabOptionIdBack() {
		return this.tabOptionIdBack;
	}

	public void setTabOptionIdBack(Integer tabOptionIdBack) {
		this.tabOptionIdBack = tabOptionIdBack;
	}

	public TabExamQuestion getTabExamQuestion() {
		return this.tabExamQuestion;
	}

	public void setTabExamQuestion(TabExamQuestion tabExamQuestion) {
		this.tabExamQuestion = tabExamQuestion;
	}

	public TabOption getTabOption() {
		return this.tabOption;
	}

	public void setTabOption(TabOption tabOption) {
		this.tabOption = tabOption;
	}

	public String getOptionTextBack() {
		return this.optionTextBack;
	}

	public void setOptionTextBack(String optionTextBack) {
		this.optionTextBack = optionTextBack;
	}

	public String getOptionValueBack() {
		return this.optionValueBack;
	}

	public void setOptionValueBack(String optionValueBack) {
		this.optionValueBack = optionValueBack;
	}

}