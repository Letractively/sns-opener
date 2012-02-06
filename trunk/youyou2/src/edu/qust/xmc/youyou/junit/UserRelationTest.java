package edu.qust.xmc.youyou.junit;

import java.util.List;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserRelation;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.dao.UserRelationDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.daoimpl.UserRelationDAOImpl;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class UserRelationTest {
	@Test
	public void UserRelationTest() {
		UserRelationDAO urd = new UserRelationDAOImpl();
		// UserRelation userRelation=new UserRelation(7,8,1);
		// urd.addUserRelation(userRelation);
		// UserService us=new UserServiceImpl();
		// List<User> userList =us.getUserConcernMeWithGroup(7, 1);
		//		
		// for(User ur:userList){
		// System.out.println(ur.toString());
		// }
		// UserDAO ud=new UserDAOImpl();
		// User me=ud.getUserById(5);
		// for(User u:me.getFollows()){
		// System.out.println(u.getId());
		// }
		// List<User> ul=urd.getAllObserverByPublisherId(7);
		// for(User u:ul){
		// System.out.println(u.toString());
		// }
		List<User> userList = urd.getAllPublisherByObserverId(7);
		for (User u : userList) {
			u
					.setRelation(urd.getGroupNameByObserverIdPublisherId(7, u
							.getId()));
		}
		for(User user:userList){
			System.out.println(user.getName()+ " " +user.getRelation());
		}
	}
}
