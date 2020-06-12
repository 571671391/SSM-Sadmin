package com.lhn.bean;

public class Cart {
	private Integer id;
	private String username;
	private String commodityGoodsNo;
	private Integer nums;
	private String purchasePlan;
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
	public String getCommodityGoodsNo() {
		return commodityGoodsNo;
	}
	public void setCommodityGoodsNo(String commodityGoodsNo) {
		this.commodityGoodsNo = commodityGoodsNo;
	}
	public Integer getNums() {
		return nums;
	}
	public void setNums(Integer nums) {
		this.nums = nums;
	}
	public String getPurchasePlan() {
		return purchasePlan;
	}
	public void setPurchasePlan(String purchasePlan) {
		this.purchasePlan = purchasePlan;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", username=" + username + ", commodityGoodsNo=" + commodityGoodsNo + ", nums=" + nums
				+ ", purchasePlan=" + purchasePlan + "]";
	}
}
