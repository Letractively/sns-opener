package edu.qust.xmc.youyou.service;

import java.util.List;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.User;

public interface TwitterService {
	public boolean addTwitter(User user, String content);

	public List<Message> getAllTwitterPublishedByUserId(int userId);
	
	public List<Message> getAllTwitterIconcern(int userId);
	
}
