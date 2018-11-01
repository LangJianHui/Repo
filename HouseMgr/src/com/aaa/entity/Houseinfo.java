package com.aaa.entity;

import org.apache.struts2.json.annotations.JSON;

/**
 * Houseinfo entity. @author MyEclipse Persistence Tools
 */

public class Houseinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	
	private Housetype housetype;
	private String title;
	private String linkman;
	private String phone;
	private Double price;

	// Constructors

	/** default constructor */
	public Houseinfo() {
	}

	/** minimal constructor */
	public Houseinfo(String title, String linkman, String phone, Double price) {
		this.title = title;
		this.linkman = linkman;
		this.phone = phone;
		this.price = price;
	}

	/** full constructor */
	public Houseinfo(Housetype housetype, String title, String linkman, String phone, Double price) {
		this.housetype = housetype;
		this.title = title;
		this.linkman = linkman;
		this.phone = phone;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JSON(serialize=false)
	public Housetype getHousetype() {
		return this.housetype;
	}

	public void setHousetype(Housetype housetype) {
		this.housetype = housetype;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}