package com.example.rhdm;

public class 過去利用状況 {

	private String ユーザID;
	private int 過去利用回数;
	private int 過去利用額計;
	public String getユーザID() {
		return ユーザID;
	}
	public void setユーザID(String ユーザid) {
		ユーザID = ユーザid;
	}
	public int get過去利用回数() {
		return 過去利用回数;
	}
	public void set過去利用回数(int 過去利用回数) {
		this.過去利用回数 = 過去利用回数;
	}
	public int get過去利用額計() {
		return 過去利用額計;
	}
	public void set過去利用額計(int 過去利用額計) {
		this.過去利用額計 = 過去利用額計;
	}
}
