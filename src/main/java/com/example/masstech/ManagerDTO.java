package com.example.masstech;

public class ManagerDTO {
	private Integer mid;
	private String mname;
	public ManagerDTO(Integer mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public ManagerDTO() {
		super();
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
}
