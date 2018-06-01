package com.aaa.entity;

/**
 * TabTeacher entity. @author MyEclipse Persistence Tools
 */

public class TabTeacher implements java.io.Serializable {

	// Fields

	private Integer tabTeacherId;
	private String teacherCode;
	private String teacherName;
	private String teacherSex;
	private String teacherDistict;
	private String teacherAddr;
	private String teacherPhone;
	private String teacherEmail;

	// Constructors

	/** default constructor */
	public TabTeacher() {
	}

	/** full constructor */
	public TabTeacher(String teacherCode, String teacherName, String teacherSex, String teacherDistict,
			String teacherAddr, String teacherPhone, String teacherEmail) {
		this.teacherCode = teacherCode;
		this.teacherName = teacherName;
		this.teacherSex = teacherSex;
		this.teacherDistict = teacherDistict;
		this.teacherAddr = teacherAddr;
		this.teacherPhone = teacherPhone;
		this.teacherEmail = teacherEmail;
	}

	// Property accessors

	public Integer getTabTeacherId() {
		return this.tabTeacherId;
	}

	public void setTabTeacherId(Integer tabTeacherId) {
		this.tabTeacherId = tabTeacherId;
	}

	public String getTeacherCode() {
		return this.teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSex() {
		return this.teacherSex;
	}

	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}

	public String getTeacherDistict() {
		return this.teacherDistict;
	}

	public void setTeacherDistict(String teacherDistict) {
		this.teacherDistict = teacherDistict;
	}

	public String getTeacherAddr() {
		return this.teacherAddr;
	}

	public void setTeacherAddr(String teacherAddr) {
		this.teacherAddr = teacherAddr;
	}

	public String getTeacherPhone() {
		return this.teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherEmail() {
		return this.teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

}