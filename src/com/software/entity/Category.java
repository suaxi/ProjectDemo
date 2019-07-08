package com.software.entity;

/**
 * @author 作者 : 007
 * @version 创建时间：2019年6月25日 下午4:21:05 类说明
 */
public class Category {
	private int id;
	private String name;

	public Category() {
		super();
	}

	
	public Category(String name) {
		super();
		this.name = name;
	}


	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

}
