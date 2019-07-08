package com.software.entity;

/**
 * @author 作者 : 007
 * @version 创建时间：2019年6月22日 下午12:26:12 类说明
 */
public class Cart {
	private int id;
	private int user_id;
	private int game_id;
	private double price;
	private int count;
	private int total_price;
	private int status;

	public Cart() {
		super();
	}

	public Cart(int id, int user_id, int game_id, double price, int count, int total_price) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.game_id = game_id;
		this.price = price;
		this.count = count;
		this.total_price = total_price;
	}

	public Cart(int user_id, int game_id, double price, int count, int total_price) {
		super();
		this.user_id = user_id;
		this.game_id = game_id;
		this.price = price;
		this.count = count;
		this.total_price = total_price;
	}

	public Cart(int id, int user_id, int game_id, double price, int total_price) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.game_id = game_id;
		this.price = price;
		this.total_price = total_price;
	}

	public Cart(int user_id, int game_id, double price, int total_price) {
		super();
		this.user_id = user_id;
		this.game_id = game_id;
		this.price = price;
		this.total_price = total_price;
	}

	public Cart(int user_id, int game_id, double price) {
		super();
		this.user_id = user_id;
		this.game_id = game_id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public Cart(int status) {
		super();
		this.status = status;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user_id=" + user_id + ", game_id=" + game_id + ", price=" + price + ", count="
				+ count + ", total_price=" + total_price + ", status=" + status + "]";
	}

	

}
