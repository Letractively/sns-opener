package edu.qust.xmc.youyou.junit;

import java.util.List;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class UserTest {
	@Test
	public void TestUser() {
		UserDAO ud = new UserDAOImpl();
		
		// 1.
		// for (User user : ud.getAllUser()) {
		// System.out.println(user.toString());
		// }
		// System.out.println(ud.getUserByEmail("你好").toString());
		// 2.
		// User xmc = new User(2, "xxxx", "xxxx", "wwww", true);
		// ud.insertUser(xmc);

		// 3.
		// System.out.println(ud.getUserById(26).toString());

		// 注册
//		Userservice us = new UserServiceImpl();
//		// User user = new User("aaaaaaaa", "sssssssss", "11111111", true);
//		// us.userRegist(user);
//		// System.out.println( us.userLogin(1));
//		User user = us.getUserInfo(5);
//		User user2=us.userLoginAndGetUser("hello", "hello");
//		System.out.println(user.toString());
//		user.addObserver(user2);
		//ud.updateTheme(0, 6);
//		System.out.println(user.isMan());
//		List<User> ul=ud.getAllUserMatched("是傻");
//		for(User u:ul){
//			System.out.println(u.toString());
//		}
		
	
		
	}
}
