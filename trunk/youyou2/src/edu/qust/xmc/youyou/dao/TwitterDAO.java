package edu.qust.xmc.youyou.dao;

import java.util.List;

import edu.qust.xmc.youyou.beans.TwitterMessage;

public interface TwitterDAO {
	public void insertTwitter(TwitterMessage twitterMsg);

	public List<TwitterMessage> getAllTwitterByPublisherId(int i);

	public List<TwitterMessage> getAllTwitter();
	
	public List<TwitterMessage> getAllTwitterByObserverId(int userId);

	public List<TwitterMessage> getTwittersIPublishedByLimit(int userId,
			int groupStartId,int length);

	public List<TwitterMessage> getTwittersIConcernByUserIdGroupId(int userId,
			int groupId, int startId, int length);

	public List<TwitterMessage> getAllTwittersIConcernByUserIdWithPart(
			int userId, int startId, int length);
}
