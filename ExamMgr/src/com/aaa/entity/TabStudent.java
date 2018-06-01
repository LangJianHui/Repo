package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TabStudent entity. @author MyEclipse Persistence Tools
 */

public class TabStudent implements java.io.Serializable {

	// Fields

	private Integer tabStuId;
	private TabClasses tabClasses;
	private String stuCode;
	private Date stuBirthday;
	private Integer stuAge;
	private String stuSex;
	private String stuName;
	private String stuDist;
	private String stuAddr;
	private String stuRelationPerson;
	private String stuRelationPhone;
	private String stuRelation;
	private String stuPhone;
	private String stuEmail;
	private Set tabStudentExams = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabStudent() {
	}

	/** full constructor */
	public TabStudent(TabClasses tabClasses, String stuCode, Date stuBirthday, Integer stuAge, String stuSex,
			String stuName, String stuDist, String stuAddr, String stuRelationPerson, String stuRelationPhone,
			String stuRelation, String stuPhone, String stuEmail, Set tabStudentExams) {
		this.tabClasses = tabClasses;
		this.stuCode = stuCode;
		this.stuBirthday = stuBirthday;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuName = stuName;
		this.stuDist = stuDist;
		this.stuAddr = stuAddr;
		this.stuRelationPerson = stuRelationPerson;
		this.stuRelationPhone = stuRelationPhone;
		this.stuRelation = stuRelation;
		this.stuPhone = stuPhone;
		this.stuEmail = stuEmail;
		this.tabStudentExams = tabStudentExams;
	}

	// Property accessors

	public Integer getTabStuId() {
		return this.tabStuId;
	}

	public void setTabStuId(Integer tabStuId) {
		this.tabStuId = tabStuId;
	}

	public TabClasses getTabClasses() {
		return this.tabClasses;
	}

	public void setTabClasses(TabClasses tabClasses) {
		this.tabClasses = tabClasses;
	}

	public String getStuCode() {
		return this.stuCode;
	}

	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}

	public Date getStuBirthday() {
		return this.stuBirthday;
	}

	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}

	public Integer getStuAge() {
		return this.stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuDist() {
		return this.stuDist;
	}

	public void setStuDist(String stuDist) {
		this.stuDist = stuDist;
	}

	public String getStuAddr() {
		return this.stuAddr;
	}

	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}

	public String getStuRelationPerson() {
		return this.stuRelationPerson;
	}

	public void setStuRelationPerson(String stuRelationPerson) {
		this.stuRelationPerson = stuRelationPerson;
	}

	public String getStuRelationPhone() {
		return this.stuRelationPhone;
	}

	public void setStuRelationPhone(String stuRelationPhone) {
		this.stuRelationPhone = stuRelationPhone;
	}

	public String getStuRelation() {
		return this.stuRelation;
	}

	public void setStuRelation(String stuRelation) {
		this.stuRelation = stuRelation;
	}

	public String getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getStuEmail() {
		return this.stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public Set getTabStudentExams() {
		return this.tabStudentExams;
	}

	public void setTabStudentExams(Set tabStudentExams) {
		this.tabStudentExams = tabStudentExams;
	}

}