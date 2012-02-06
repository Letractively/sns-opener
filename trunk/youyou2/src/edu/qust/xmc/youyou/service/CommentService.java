package edu.qust.xmc.youyou.service;

import java.util.List;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.beans.CommentTip;

public interface CommentService {
	public List<Comment> getComments(int twitterId);

	public void addComment(int id, int twitterId, String content);
	
	public List<CommentTip> getCommentTips(int userId);

	public void readedTip(int tipId);

}
