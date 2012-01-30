package edu.qust.xmc.youyou.dao;

import java.util.List;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.TwitterMessage;

public interface TwitterDAO {
	public void insertTwitter(TwitterMessage twitterMsg);

	public List<Message> getAllTwitterByPublisherId(int i);

	public List<Message> getAllTwitter();
	
	public List<Message> getAllTwitterByObserverId(int userId);
}
