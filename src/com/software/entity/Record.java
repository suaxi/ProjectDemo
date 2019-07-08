package com.software.entity;
/** 
* @author 作者 : 007
* @version 创建时间：2019年6月19日 下午4:30:05 
* 类说明 
*/

import java.sql.Timestamp;

public class Record {
	private int id;
	private int userId;
	private int gameId;
	private String username;
	private String gamename;
	private Timestamp buydate;
	private double price;

	public Record() {
		super();
	}

	public Record(int id, int userId, int gameId, String username, String gamename, Timestamp buydate, double price) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.username = username;
		this.gamename = gamename;
		this.buydate = buydate;
		this.price = price;
	}

	public Record(int id, int userId, int gameId, Timestamp buydate, double price) {
		super();
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.buydate = buydate;
		this.price = price;
	}
	
	

	public Record(int userId, int gameId, double price) {
		super();
		this.userId = userId;
		this.gameId = gameId;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public Timestamp getBuydate() {
		return buydate;
	}

	public void setBuydate(Timestamp buydate) {
		this.buydate = buydate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", userId=" + userId + ", gameId=" + gameId + ", username=" + username
				+ ", gamename=" + gamename + ", buydate=" + buydate + ", price=" + price + "]";
	}

}
