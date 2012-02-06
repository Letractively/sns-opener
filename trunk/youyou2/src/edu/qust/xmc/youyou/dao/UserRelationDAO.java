package edu.qust.xmc.youyou.dao;

import java.util.List;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserRelation;

public interface UserRelationDAO {
	public boolean addUserRelation(UserRelation userRelation);

	public List<User> getAllPublisherByObserverId(int userId);

	public void delUserRelation(UserRelation ur);

	public List<User> getAllObserverByPublisherId(int userId);

	public List<User> getObserverByPublisherIdWithGroup(int id, int start,
			int length);

	public List<User> getPublisherByObserverIdWithGroup(int id, int start,
			int length);

	public String getGroupNameByObserverIdPublisherId(int observerId,
			int publisherId);
}
