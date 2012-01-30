package edu.qust.xmc.youyou.junit;

import java.util.List;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserRelation;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.dao.UserRelationDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.daoimpl.UserRelationDAOImpl;

public class UserRelationTest {
	@Test
	public void UserRelationTest(){
		UserRelationDAO urd=new UserRelationDAOImpl();
//		UserRelation userRelation=new UserRelation(3,5);
//		urd.addUserRelation(userRelation);
		
		List<User> userList = urd.getAllObserverByPublisherId(7);
		
		for(User ur:userList){
			System.out.println(ur.toString());
		}
//		UserDAO ud=new UserDAOImpl();
//		User me=ud.getUserById(5);
//		for(User u:me.getFollows()){
//			System.out.println(u.getId());
//		}
//		List<User> ul=urd.getAllObserverByPublisherId(7);
//		for(User u:ul){
//			System.out.println(u.toString());
//		}
	}
}
