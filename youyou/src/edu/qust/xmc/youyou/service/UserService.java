package edu.qust.xmc.youyou.service;

import java.util.List;

import edu.qust.xmc.youyou.beans.User;

public interface UserService {
	public boolean userRegist(User user);
	public boolean userLogined(int id);
	public boolean userLogin(String email, String pwd);
	public User userLoginAndGetUser(String email, String pwd);
	public boolean IsRegistedByEmail(String email);
	public List<User> getAllUserIConcern(int myId);
	public User getUserInfo(int userId);
	public List<User> getAllUserConcernMe(int myId);
}
