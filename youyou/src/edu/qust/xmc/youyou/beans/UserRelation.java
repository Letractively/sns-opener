package edu.qust.xmc.youyou.beans;

import java.util.Date;

public class UserRelation {
	private int publisherId;
	private int observerId;
	private Date cTime;
	public UserRelation(){
		
	}
	public Date getcTime() {
		return cTime;
	}
	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}
	public UserRelation(int publisherId,int observerId){
		this.publisherId=publisherId;
		this.observerId=observerId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public int getObserverId() {
		return observerId;
	}
	public void setObserverId(int observerId) {
		this.observerId = observerId;
	}
}
