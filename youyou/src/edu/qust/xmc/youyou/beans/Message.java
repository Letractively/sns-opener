package edu.qust.xmc.youyou.beans;

public class Message{
	private int id;
	private int userId;
	private String content;
	public Message(){
		
	}
	public Message(int userId,String content){
		this.userId=userId;
		this.content=content;
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
}
