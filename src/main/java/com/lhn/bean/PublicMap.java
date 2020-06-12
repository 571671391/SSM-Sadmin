package com.lhn.bean;

public class PublicMap<T> {
    private int code;
    private String msg;
    private int count;
    private T data;
    
    
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public T getData() {
		return data;
	}
	
	public PublicMap(){}
	
	public PublicMap(int code, String msg, int count, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		return "PublicMap [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
}
