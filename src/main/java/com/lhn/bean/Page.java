package com.lhn.bean;

public class Page{
	//当前页
    private Integer page=1;
    //页大小
    private Integer rows;
    //总记录数
    private Integer totalRecord;
    //总页数
    private Integer totalPage;
    //商品类型分类
    private String eclass;
    //商品价格分类
    private String pclass;
    //商品排序方式
    private String sclass;
    //关键字类型
    private String keyType;
    //查询关键字
    private String keyWord;
    //开始记录位置
    private Integer start;
    
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public String getEclass() {
		return eclass;
	}
	public void setEclass(String eclass) {
		this.eclass = eclass;
	}
	public String getPclass() {
		return pclass;
	}
	public void setPclass(String pclass) {
		this.pclass = pclass;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getKeyType() {
		return keyType;
	}
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", totalRecord=" + totalRecord + ", totalPage=" + totalPage
				+ ", eclass=" + eclass + ", pclass=" + pclass + ", sclass=" + sclass + ", keyType=" + keyType
				+ ", keyWord=" + keyWord + ", start=" + start + "]";
	}
    
}

