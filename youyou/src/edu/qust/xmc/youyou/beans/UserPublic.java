package edu.qust.xmc.youyou.beans;

import java.util.Date;

public class UserPublic {
	private int id;
	private String name;
	private String email;
	private boolean man;
	private Date cTime;
	private int themeId;
	private int concernMeNum;
	private int twitterNumIPublish;

	public UserPublic() {

	}

	public UserPublic(int id, String name, String email, boolean man,
			Date cTime, int themeId, int concernMeNum, int twitterNumIPublish) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.man = man;
		this.cTime = cTime;
		this.themeId = themeId;
		this.concernMeNum = concernMeNum;
		this.twitterNumIPublish = twitterNumIPublish;

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

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

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

	@Override
	public String toString() {
		return "user:" + getId() + "\tname:" + getName() + "\tEmail:"
				+ getEmail() + "\tis man:" + isMan() + "\tconcernMeNum:"
				+ concernMeNum + "\t twitterNumIPublish" + twitterNumIPublish;
	}
}
