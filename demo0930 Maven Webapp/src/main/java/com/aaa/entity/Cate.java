package com.aaa.entity;

public class Cate {
	private int id;
	private String name;
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
	public Cate(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Cate(int id) {
		super();
		this.id = id;
	}
	public Cate() {
		super();
	}
	@Override
	public String toString() {
		return "Cate [id=" + id + ", name=" + name + "]";
	}
	
}
