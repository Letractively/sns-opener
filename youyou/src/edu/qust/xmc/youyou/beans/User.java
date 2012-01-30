package edu.qust.xmc.youyou.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import edu.qust.xmc.youyou.dao.TwitterDAO;
import edu.qust.xmc.youyou.dao.UserRelationDAO;
import edu.qust.xmc.youyou.daoimpl.TwitterDAOImpl;
import edu.qust.xmc.youyou.daoimpl.UserRelationDAOImpl;

public class User extends Observable implements Observer {
	private int id;
	private String name;
	private String pwd;
	private String email;
	private boolean man;
	private Date cTime;
	private int themeId;
	private int concernMeNum;
	private int twitterNumIPublish;

	public int getConcernMeNum() {
		return concernMeNum;
	}

	public void setConcernMeNum(int concernMeNum) {
		this.concernMeNum = concernMeNum;
	}

	public int getTwitterNumIPublish() {
		return twitterNumIPublish;
	}

	public void setTwitterNumIPublish(int twitterNumIPublish) {
		this.twitterNumIPublish = twitterNumIPublish;
	}

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	public User() {

	}

	public User(int no, String name, String pwd, String email, boolean man) {
		this.id = no;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.man = man;
	}

	public User(String name, String pwd, String email, boolean man) {
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.man = man;
	}

	@Override
	public synchronized void addObserver(Observer follow) {
		// 添加follows
		UserRelationDAO urd = new UserRelationDAOImpl();
		urd.addUserRelation(new UserRelation(this.getId(), ((User) follow)
				.getId()));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMan() {
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}

	public Date getcTime() {
		return cTime;
	}

	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}

	public List<User> getFollows() {
		UserRelationDAO urd = new UserRelationDAOImpl();
		List<User> follows = urd.getAllPublisherByObserverId(id);
		return follows;
	}

	@Override
	protected synchronized void clearChanged() {
		// TODO Auto-generated method stub
		super.clearChanged();
	}

	@Override
	public synchronized int countObservers() {
		// TODO Auto-generated method stub
		return super.countObservers();
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
	}

	@Override
	public synchronized void deleteObservers() {
		// TODO Auto-generated method stub
		super.deleteObservers();
	}

	@Override
	public synchronized boolean hasChanged() {
		// TODO Auto-generated method stub
		return super.hasChanged();
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object msg) {
	}

	@Override
	protected synchronized void setChanged() {
		// TODO Auto-generated method stub
		super.setChanged();
	}

	public void update(Observable o, Object msg) {
		System.out.println("I am " + getName() + " and I was told by "
				+ ((User) o).getName() + " : " + ((Message) msg).getContent());
	}

	public void publishMessage(Message msg) {
		TwitterDAO td = new TwitterDAOImpl();
		td.insertTwitter((TwitterMessage) msg);
		this.notifyObservers(msg);
	}

	public void deleteObserverById(int id) {
		UserRelationDAO urd = new UserRelationDAOImpl();
		UserRelation ur = new UserRelation(id, this.getId());
		urd.delUserRelation(ur);
	}

	@Override
	public String toString() {
		return "user:" + getId() + "\tname:" + getName() + "\tpwd:" + getPwd()
				+ "\tEmail:" + getEmail() + "\tis man:" + isMan()
				+ "\tconcernMeNum:" + concernMeNum + "\t twitterNumIPublish"
				+ twitterNumIPublish;
	}

	public UserPublic toUserPublic() {
		return new UserPublic(id, name, email, man, cTime, themeId,
				concernMeNum, twitterNumIPublish);
	}

}
