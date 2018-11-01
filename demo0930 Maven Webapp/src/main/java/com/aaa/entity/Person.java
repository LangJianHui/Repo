package com.aaa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Person {
	private int id;
	private String name;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd") //  方式一：日期类型转换
	private Date birthday;
	
	private Cate cate;
	
	public Cate getCate() {
		return cate;
	}
	public void setCate(Cate cate) {
		this.cate = cate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Person(int id, String name, String sex, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}
	
	public Person() {
		super();
	}
	@Override
	public String toString() {
		String str="Person [id=" + id + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday 
				;
		if(cate!=null)
			str+=", cate=" + cate;
		return str;
	}

	
}
