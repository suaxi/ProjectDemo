package com.software.entity;

/**
 * @author 作者 : 007
 * @version 创建时间：2019年6月17日 上午10:59:30
 */
public class User {
	private String id;
	private String username;
	private String password;
	private String idnumber;
	private String tel;
	private String email;
	private String type;

	public User() {
		super();
	}

	public User(String username, String password, String idnumber) {
		super();
		this.username = username;
		this.password = password;
		this.idnumber = idnumber;
	}

	
	public User(String username) {
		super();
		this.username = username;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User(String username, String password, String idnumber, String tel, String email) {
		super();
		this.username = username;
		this.password = password;
		this.idnumber = idnumber;
		this.tel = tel;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public User(String id, String username, String password, String idnumber, String tel, String email, String type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.idnumber = idnumber;
		this.tel = tel;
		this.email = email;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", idnumber=" + idnumber
				+ ", tel=" + tel + ", email=" + email + "]";
	}

}
