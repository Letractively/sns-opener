package edu.qust.xmc.youyou.dao;

import java.util.List;

import edu.qust.xmc.youyou.beans.User;

public interface UserDAO {
	public List<User> getAllUser();
	public void insertUser(User user);
	public User getUserById(int id);
	public User getUserByEmail(String email);
	public void updateTheme(int themeId,int userId);
	public List<User> getAllUserMatched(String input);
	
}
