package edu.qust.xmc.youyou.junit;

import java.util.List;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.dao.CommentDAO;
import edu.qust.xmc.youyou.daoimpl.CommentDAOImpl;

public class CommentTest {
	@Test
	public void test() {
		CommentDAO cd = new CommentDAOImpl();
		cd.insertComment(7, 22, "7 comment to 22");
//		List<Comment> cl = cd.getCommentByTwitterId(22);
//		for (Comment c : cl) {
//			System.out.println(c.getContent()+" "+c.getUserName());
//		}
	}
}
