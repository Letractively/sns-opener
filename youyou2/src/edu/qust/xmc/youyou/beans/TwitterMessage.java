package edu.qust.xmc.youyou.beans;

import java.util.Date;

public class TwitterMessage  {
	private int id;
	private int userId;
	private String content;
	private Date cTime;
	public TwitterMessage() {

	}

	public TwitterMessage(int userId, String content) {
		this.userId = userId;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getcTime() {
		return cTime;
	}

	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}
}
