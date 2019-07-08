package com.software.entity;

public class Game {
	private int id;
	private String name;
	private String brand;
	private int brand_id;
	private String category;
	private int category_id;
	private double price;
	private String start_date;
	private int status;
	private String info;
	private int count;
	private String picture_url;

	public Game() {
		super();
	}

	public Game(String name, String brand, String category, double price, String start_date, String info) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.start_date = start_date;
		this.info = info;
	}

	public Game(String name, String brand, String category, double price, String start_date, String info, int count) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.start_date = start_date;
		this.info = info;
		this.count = count;
	}

	public Game(String name, String brand, String category, double price, String start_date, String info,
			String picture_url) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.start_date = start_date;
		this.info = info;
		this.picture_url = picture_url;
	}

	public Game(String name, String brand, String category, double price, String start_date, int status, String info) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.start_date = start_date;
		this.status = status;
		this.info = info;
	}

	public Game(String name, String brand, String category, double price, String start_date, int status, String info,
			int count) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.start_date = start_date;
		this.status = status;
		this.info = info;
		this.count = count;
	}

	public Game(int id, String name, int brand_id, int category_id, double price, String start_date, int status,
			String info, int count) {
		super();
		this.id = id;
		this.name = name;
		this.brand_id = brand_id;
		this.category_id = category_id;
		this.price = price;
		this.start_date = start_date;
		this.status = status;
		this.info = info;
		this.count = count;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getPicture_url() {
		return picture_url;
	}

	public void setPicture_url(String picture_url) {
		this.picture_url = picture_url;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", brand=" + brand + ", brand_id=" + brand_id + ", category="
				+ category + ", category_id=" + category_id + ", price=" + price + ", start_date=" + start_date
				+ ", status=" + status + ", info=" + info + ", count=" + count + ", picture_url=" + picture_url + "]";
	}
}
