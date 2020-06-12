package com.lhn.bean;

public class Commodity {
    private Integer id;
    private String imgSrc;
    private String commodityName;
    private String commodityClass;
    private String commodityMs;
    private String commodityGoodsNo;
    private Double commodityMarketPrice;
    private Double commoditySellPrice;
    private Integer commodityStockNum;
    private String productName;
    private String productColor;
    private String productWeight;
    private String productSize;
    private String zxsj;
    private String zlbz;
    private String gzwd;
    private String bcwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCommodityClass() {
		return commodityClass;
	}
	public void setCommodityClass(String commodityClass) {
		this.commodityClass = commodityClass;
	}
	public String getCommodityMs() {
		return commodityMs;
	}
	public void setCommodityMs(String commodityMs) {
		this.commodityMs = commodityMs;
	}
	public String getCommodityGoodsNo() {
		return commodityGoodsNo;
	}
	public void setCommodityGoodsNo(String commodityGoodsNo) {
		this.commodityGoodsNo = commodityGoodsNo;
	}
	public Double getCommodityMarketPrice() {
		return commodityMarketPrice;
	}
	public void setCommodityMarketPrice(Double commodityMarketPrice) {
		this.commodityMarketPrice = commodityMarketPrice;
	}
	public Double getCommoditySellPrice() {
		return commoditySellPrice;
	}
	public void setCommoditySellPrice(Double commoditySellPrice) {
		this.commoditySellPrice = commoditySellPrice;
	}
	public Integer getCommodityStockNum() {
		return commodityStockNum;
	}
	public void setCommodityStockNum(Integer commodityStockNum) {
		this.commodityStockNum = commodityStockNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public String getZxsj() {
		return zxsj;
	}
	public void setZxsj(String zxsj) {
		this.zxsj = zxsj;
	}
	public String getZlbz() {
		return zlbz;
	}
	public void setZlbz(String zlbz) {
		this.zlbz = zlbz;
	}
	public String getGzwd() {
		return gzwd;
	}
	public void setGzwd(String gzwd) {
		this.gzwd = gzwd;
	}
	public String getBcwd() {
		return bcwd;
	}
	public void setBcwd(String bcwd) {
		this.bcwd = bcwd;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", imgSrc=" + imgSrc + ", commodityName=" + commodityName + ", commodityClass="
				+ commodityClass + ", commodityMs=" + commodityMs + ", commodityGoodsNo=" + commodityGoodsNo
				+ ", commodityMarketPrice=" + commodityMarketPrice + ", commoditySellPrice=" + commoditySellPrice
				+ ", commodityStockNum=" + commodityStockNum + ", productName=" + productName + ", productColor="
				+ productColor + ", productWeight=" + productWeight + ", productSize=" + productSize + ", zxsj=" + zxsj
				+ ", zlbz=" + zlbz + ", gzwd=" + gzwd + ", bcwd=" + bcwd + "]";
	}
	
	
}
