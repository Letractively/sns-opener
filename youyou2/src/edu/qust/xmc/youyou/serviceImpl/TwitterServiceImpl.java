package edu.qust.xmc.youyou.serviceImpl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.TwitterDAO;
import edu.qust.xmc.youyou.daoimpl.TwitterDAOImpl;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.util.Util;

public class TwitterServiceImpl implements TwitterService {

	TwitterDAO td = new TwitterDAOImpl();

	public boolean addTwitter(User user, String content) {
		TwitterMessage msg = new TwitterMessage(user.getId(), content);
		user.publishMessage(msg);
		return true;
	}

	public List<TwitterMessage> getAllTwitterPublishedByUserId(int userId) {
		return td.getAllTwitterByPublisherId(userId);
	}

	public List<TwitterMessage> getAllTwitterIconcern(int userId) {

		return td.getAllTwitterByObserverId(userId);

	}

	public List<TwitterMessage> getTwittersIConcernTop(int userId) {
		return td.getAllTwittersIConcernByUserIdWithPart(userId, 0,
				Util.NUM_TO_LIST_ONE_GROUP);
	}

	public List<TwitterMessage> getTwittersIPublishedByGroup(int userId,
			int groupId) {
		int startId = groupId * Util.NUM_TO_LIST_ONE_GROUP;
		int length = Util.NUM_TO_LIST_ONE_GROUP;
		return td.getTwittersIPublishedByLimit(userId, startId, length);
	}

	public List<TwitterMessage> getTwitterIConcernWithGroup(int userId,
			int partId, int groupId) {
		int startId = partId * Util.NUM_TO_LIST_ONE_GROUP;
		int length = Util.NUM_TO_LIST_ONE_GROUP;
		if (groupId != 0) {
			return td.getTwittersIConcernByUserIdGroupId(userId, groupId,
					startId, length);
		} else {
			return td.getAllTwittersIConcernByUserIdWithPart(userId, startId,
					length);
		}
	}


}
