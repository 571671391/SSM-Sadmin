package com.lhn.bean;


public class CC {
    private Integer commodityId;
    private String imgSrc;
    private String commodityName;
    private Integer commoditySellPrice;
    private Integer cartId;
    private Integer nums;
	public Integer getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public Integer getCommoditySellPrice() {
		return commoditySellPrice;
	}
	public void setCommoditySellPrice(Integer commoditySellPrice) {
		this.commoditySellPrice = commoditySellPrice;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getNums() {
		return nums;
	}
	public void setNums(Integer nums) {
		this.nums = nums;
	}
	@Override
	public String toString() {
		return "CC [commodityId=" + commodityId + ", imgSrc=" + imgSrc + ", commodityName=" + commodityName
				+ ", commoditySellPrice=" + commoditySellPrice + ", cartId=" + cartId + ", nums=" + nums + "]";
	}
	

}
