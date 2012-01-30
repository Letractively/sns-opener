package edu.qust.xmc.youyou.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserPublic;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;
import edu.qust.xmc.youyou.util.Util;

public class GsonTest {

	@Test
	public void gsonTest(){
		UserService us=new UserServiceImpl();
		List<User> userList = us.getAllUserConcernMe(7);
		List<UserPublic> upl=Util.userToPublicList(userList);
		Gson gson=new Gson();
		String result=gson.toJson(upl);
		System.out.println(result);
	}
}
