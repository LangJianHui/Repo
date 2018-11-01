package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Housetype entity. @author MyEclipse Persistence Tools
 */

public class Housetype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String tname;
	private Set houseinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Housetype() {
	}

	/** minimal constructor */
	public Housetype(String tname) {
		this.tname = tname;
	}

	/** full constructor */
	public Housetype(String tname, Set houseinfos) {
		this.tname = tname;
		this.houseinfos = houseinfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set getHouseinfos() {
		return this.houseinfos;
	}

	public void setHouseinfos(Set houseinfos) {
		this.houseinfos = houseinfos;
	}

}