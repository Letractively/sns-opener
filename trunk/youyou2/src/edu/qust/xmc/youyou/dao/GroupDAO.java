package edu.qust.xmc.youyou.dao;

import java.util.List;

import edu.qust.xmc.youyou.beans.Group;

public interface GroupDAO {
	public List<Group> getAllGroupsByUserId(int userId);
	public void insertGroup(Group group);
	public void updateGroupByName(Group group);
	public Group getGroupByUserIdAndName(int userId,String name);
	public void deleteByGroupId(int groupId);
}
