package com.kgisl.tech.model;

public class User {

	private String user;
	private String pwd;
	private String token;

	public User() {
		
	}
	
	public User(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "User [" + (user != null ? "user=" + user + ", " : "") + (pwd != null ? "pwd=" + pwd : "") + "]";
	}

}