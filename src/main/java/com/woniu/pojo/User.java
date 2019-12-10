package com.woniu.pojo;

public class User {
	private Integer uid;
	private String  uname;
	private String upsw;
	public User(){
	}	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpsw() {
		return upsw;
	}
	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upsw=" + upsw + "]";
	}
	
}
