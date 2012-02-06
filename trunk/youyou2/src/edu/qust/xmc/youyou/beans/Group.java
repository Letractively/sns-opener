package edu.qust.xmc.youyou.beans;

public class Group {
	private int groupId;
	private int createUserId;
	private String groupName;

	public Group() {

	}

	public Group(int id,int createUserId, String name) {
		this.groupId = id;
		this.groupName = name;
	}

	public Group(int userId, String name) {
		this.createUserId = userId;
		this.groupName = name;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(int createUserId) {
		this.createUserId = createUserId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
