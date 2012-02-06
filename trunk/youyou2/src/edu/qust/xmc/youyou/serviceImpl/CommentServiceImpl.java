package edu.qust.xmc.youyou.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.beans.CommentTip;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.dao.CommentDAO;
import edu.qust.xmc.youyou.dao.TwitterDAO;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.daoimpl.CommentDAOImpl;
import edu.qust.xmc.youyou.daoimpl.TwitterDAOImpl;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.service.CommentService;

public class CommentServiceImpl implements CommentService {
	CommentDAO cd = new CommentDAOImpl();
	TwitterDAO td = new TwitterDAOImpl();
	UserDAO ud = new UserDAOImpl();

	public List<Comment> getComments(int twitterId) {
		return cd.getCommentByTwitterId(twitterId);
	}

	public void addComment(int id, int twitterId, String content) {
		cd.insertComment(id, twitterId, content);
	}

	public List<CommentTip> getCommentTips(int userId) {
		List<CommentTip> myCommentTipList = new ArrayList<CommentTip>();
		List<TwitterMessage> twitterList = td
				.getAllTwitterByPublisherId(userId);
		for (TwitterMessage twitter : twitterList) {
			List<Comment> commentList = cd.getCommentByTwitterId(twitter
					.getId());
			for (Comment com : commentList) {
				if (!com.isReaded()) {
					CommentTip commentTip = new CommentTip();
					commentTip.setCommentTipId(com.getId());
					commentTip.setBecommentedId(userId);
					commentTip.setCommenterId(com.getUserId());
					commentTip.setCommenterName(ud.getUserById(com.getUserId())
							.getName());
					commentTip.setCommentList(commentList);
					commentTip.setTwitterContent(twitter.getContent());
					commentTip.setTwitterId(twitter.getId());

					myCommentTipList.add(commentTip);
				}
			}
		}
		return myCommentTipList;
	}

	public void readedTip(int tipId) {
		cd.updateCommentByReaded(tipId);
	}

}
