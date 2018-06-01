package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabOption entity. @author MyEclipse Persistence Tools
 */

public class TabOption implements java.io.Serializable {

	// Fields

	private Integer tabOptionId;
	private TabQuestion tabQuestion;
	private String optionText;
	private String optionValue;
	private Set tabOptionBacks = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabOption() {
	}

	/** full constructor */
	public TabOption(TabQuestion tabQuestion, String optionText, String optionValue, Set tabOptionBacks) {
		this.tabQuestion = tabQuestion;
		this.optionText = optionText;
		this.optionValue = optionValue;
		this.tabOptionBacks = tabOptionBacks;
	}

	// Property accessors

	public Integer getTabOptionId() {
		return this.tabOptionId;
	}

	public void setTabOptionId(Integer tabOptionId) {
		this.tabOptionId = tabOptionId;
	}

	public TabQuestion getTabQuestion() {
		return this.tabQuestion;
	}

	public void setTabQuestion(TabQuestion tabQuestion) {
		this.tabQuestion = tabQuestion;
	}

	public String getOptionText() {
		return this.optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public String getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public Set getTabOptionBacks() {
		return this.tabOptionBacks;
	}

	public void setTabOptionBacks(Set tabOptionBacks) {
		this.tabOptionBacks = tabOptionBacks;
	}

}