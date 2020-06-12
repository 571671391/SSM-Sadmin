package com.lhn.bean;

public class RechargeData {
	private Integer id;
	private String username;
	private Integer money;
	private String time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "RechargeData [id=" + id + ", username=" + username + ", money=" + money + ", time=" + time + "]";
	}
}
