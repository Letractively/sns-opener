package edu.qust.xmc.youyou.serviceImpl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.TwitterDAO;
import edu.qust.xmc.youyou.daoimpl.TwitterDAOImpl;
import edu.qust.xmc.youyou.service.TwitterService;

public class TwitterServiceImpl implements TwitterService {

	TwitterDAO td = new TwitterDAOImpl();
	public boolean addTwitter(User user, String content) {
		Message msg = new TwitterMessage(user.getId(), content);
		user.publishMessage(msg);
		return true;
	}

	public List<Message> getAllTwitterPublishedByUserId(int userId) {
		return td.getAllTwitterByPublisherId(userId);
	}

	public List<Message> getAllTwitterIconcern(int userId) {

		return td.getAllTwitterByObserverId(userId);
		
	}
}
