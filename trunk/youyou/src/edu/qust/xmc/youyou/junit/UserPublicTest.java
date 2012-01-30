package edu.qust.xmc.youyou.junit;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class UserPublicTest {
	@Test
	public void test(){
		UserService us=new UserServiceImpl();
		User u=us.getUserInfo(7);
		System.out.println(u.toUserPublic().toString());
	}
}
