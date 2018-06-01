package com.aaa.entity;

/**
 * TabCode entity. @author MyEclipse Persistence Tools
 */

public class TabCode implements java.io.Serializable {

	// Fields

	private Integer tabCodeId;
	private String codeValue;
	private String codeText;
	private String codeType;
	private String parentCodeValue;

	// Constructors

	/** default constructor */
	public TabCode() {
	}

	/** full constructor */
	public TabCode(String codeValue, String codeText, String codeType, String parentCodeValue) {
		this.codeValue = codeValue;
		this.codeText = codeText;
		this.codeType = codeType;
		this.parentCodeValue = parentCodeValue;
	}

	// Property accessors

	public Integer getTabCodeId() {
		return this.tabCodeId;
	}

	public void setTabCodeId(Integer tabCodeId) {
		this.tabCodeId = tabCodeId;
	}

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getCodeText() {
		return this.codeText;
	}

	public void setCodeText(String codeText) {
		this.codeText = codeText;
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getParentCodeValue() {
		return this.parentCodeValue;
	}

	public void setParentCodeValue(String parentCodeValue) {
		this.parentCodeValue = parentCodeValue;
	}

}