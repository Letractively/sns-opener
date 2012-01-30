package edu.qust.xmc.youyou.junit;

import java.util.List;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.TwitterDAO;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.daoimpl.TwitterDAOImpl;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;

public class TwitterMessageTest {

	@Test
	public void TestTwitter() {
		 TwitterDAO td=new TwitterDAOImpl();
		// TwitterMessage twitterMsg=new TwitterMessage(48,"this is a weibo");
		// td.insertTwitter(twitterMsg);
//		 UserDAO ud = new UserDAOImpl();
		 TwitterService ts = new TwitterServiceImpl();
//		 User user = ud.getUserById(63);
//		 ts.addTwitter(user, "this is a weibo from messsssssssssssssssssss");

//		List<Message> lm = td.getAllTwitter();
//		for (Message m : lm) {
//			System.out.println(m.getContent());
//		}
//		 List<Message> lm=td.getAllTwitterByUserId(58);
//		 for(Message m:lm){
//			 System.out.println(m.getContent());
//		 }
		 
//		 List<Message> tm=td.getAllTwitterByObserverId(4);
//		 List<Message> tm=ts.getAllTwitterIconcern();
//		 for(Message m:tm){
//			 System.out.println(m.getContent());
//		 }
	}
}
