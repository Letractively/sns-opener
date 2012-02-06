package edu.qust.xmc.youyou.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.beans.CommentTip;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.dao.CommentDAO;
import edu.qust.xmc.youyou.dao.TwitterDAO;
import edu.qust.xmc.youyou.daoimpl.CommentDAOImpl;
import edu.qust.xmc.youyou.daoimpl.TwitterDAOImpl;
import edu.qust.xmc.youyou.service.CommentService;
import edu.qust.xmc.youyou.serviceImpl.CommentServiceImpl;

public class CommentTipTest {
	@Test
	public void test() {
		// CommentService cs=new CommentServiceImpl();
		// // List<CommentTip> comTipList=cs.getCommentTips(13);
		// // for(CommentTip ct: comTipList){
		// // System.out.println(ct.toString());
		// // }
		// cs.readedTip(23);
		TwitterDAO td = new TwitterDAOImpl();
		CommentDAO cd = new CommentDAOImpl();
		Gson gson = new Gson();
		// List<CommentTip> myCommentTipList = new ArrayList<CommentTip>();
		// List<TwitterMessage> twitterList = td
		// .getAllTwitterByPublisherId(13);
		// for (TwitterMessage twitter : twitterList) {
		// List<Comment> commentList = cd.getCommentByTwitterId(twitter
		// .getId());
		// for (Comment com : commentList) {
		// System.out.println(gson.toJson(com));
		// }
		// }
		List<Comment> commentList = cd.getCommentByTwitterId(25);
		for (Comment com : commentList) {
			System.out.println(gson.toJson(com));
		}

	}

}
