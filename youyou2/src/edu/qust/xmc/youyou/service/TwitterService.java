package edu.qust.xmc.youyou.service;

import java.util.List;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.beans.User;

public interface TwitterService {
	public boolean addTwitter(User user, String content);

	public List<TwitterMessage> getAllTwitterPublishedByUserId(int userId);
	
	public List<TwitterMessage> getAllTwitterIconcern(int userId);

	public List<TwitterMessage> getTwittersIPublishedByGroup(int id, int groupId);

	public List<TwitterMessage> getTwitterIConcernWithGroup(int userId,int partId,
			int groupId);
	public List<TwitterMessage> getTwittersIConcernTop(int userId);
	
	
	
}
