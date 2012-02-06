package edu.qust.xmc.youyou.daoimpl;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.dao.CommentDAO;

public class CommentDAOImpl implements CommentDAO {
	private static SqlMapClient client = null;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			client = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			System.out.println("在userdao的static里面出错了");
			e.printStackTrace();
		}
	}

	public List<Comment> getCommentByTwitterId(int twitterId) {
			try {
				return client.queryForList("getCommentByTwitterId", twitterId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

	public void insertComment(int id, int twitterId, String content) {
		Comment comment=new Comment();
		comment.setUserId(id);
		comment.setTwitterId(twitterId);
		comment.setContent(content);
		try {
			client.insert("insertComment", comment);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateCommentByReaded(int tipId) {
		try {
			client.update("updateCommentByReaded", tipId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
