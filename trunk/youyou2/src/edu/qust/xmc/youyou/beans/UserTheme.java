package edu.qust.xmc.youyou.beans;

public class UserTheme {
	//此处id是指userId
	private int id;
	private int themeId;

	public UserTheme() {

	}

	public UserTheme(int themeId,int id) {
		this.themeId = themeId;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	
}