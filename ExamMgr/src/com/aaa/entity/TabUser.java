package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TabUser entity. @author MyEclipse Persistence Tools
 */

public class TabUser implements java.io.Serializable {

	// Fields

	private Integer tabUserId;
	private String userName;
	private String userPwd;
	private String userState;
	private String userInfo;
	private Integer teacherId;
	private Integer studentId;
	private Set tabUserRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public TabUser() {
	}

	/** full constructor */
	public TabUser(String userName, String userPwd, String userState, String userInfo, Integer teacherId,
			Integer studentId, Set tabUserRoles) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userState = userState;
		this.userInfo = userInfo;
		this.teacherId = teacherId;
		this.studentId = studentId;
		this.tabUserRoles = tabUserRoles;
	}

	// Property accessors

	public Integer getTabUserId() {
		return this.tabUserId;
	}

	public void setTabUserId(Integer tabUserId) {
		this.tabUserId = tabUserId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Set getTabUserRoles() {
		return this.tabUserRoles;
	}

	public void setTabUserRoles(Set tabUserRoles) {
		this.tabUserRoles = tabUserRoles;
	}

}