package com.Industry.Dependency;

public class Shop {
	int sid;
	String sname;
	String slocation;
	public Shop(int sid, String sname, String slocation) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.slocation = slocation;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", slocation=" + slocation + "]";
	}
	

}
