package com.software.entity;

/**
 * @author 作者 : 007
 * @version 创建时间：2019年6月25日 下午3:56:18 类说明
 */
public class Brand {
	private int id;
	private String name;

	public Brand() {
		super();
	}

	
	public Brand(String name) {
		super();
		this.name = name;
	}


	public Brand(int id, String name) {
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
		return "Brand [id=" + id + ", name=" + name + "]";
	}

}
