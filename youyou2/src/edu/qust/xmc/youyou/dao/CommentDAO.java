package edu.qust.xmc.youyou.dao;

import java.util.List;

import edu.qust.xmc.youyou.beans.Comment;

public interface CommentDAO {
	public List<Comment> getCommentByTwitterId(int twitterId);

	public void insertComment(int id, int twitterId, String content);

	public void updateCommentByReaded(int tipId);
}
