package edu.qust.xmc.youyou.serviceImpl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserRelation;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.dao.UserRelationDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.daoimpl.UserRelationDAOImpl;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.util.MD5;

public class UserServiceImpl implements UserService {
	UserDAO ud = new UserDAOImpl();
	UserRelationDAO urd = new UserRelationDAOImpl();

	public boolean userRegist(User user) {
		user.setPwd(MD5.MD5Encode(user.getPwd()));
		ud.insertUser(user);
		return true;
	}

	// 判断用户id的用户是否登录
	public boolean userLogined(int id) {
		if (null == ud.getUserById(id))
			return false;
		else
			return true;
	}

	// 使用email和密码进行登录操作
	public boolean userLogin(String email, String pwd) {
		User user = ud.getUserByEmail(email);
		if (user == null)
			return false;
		else if (MD5.MD5Encode(pwd).equals(user.getPwd())) {
			// 将user对象放入session中，表示user已经登录
			return true;
		} else
			return false;

	}

	// 判断email是否已经被用户注册
	public boolean IsRegistedByEmail(String email) {
		if (ud.getUserByEmail(email) == null) {
			return false;
		} else
			return true;
	}

	// 使用email和密码进行登录操作,并且返回user对象
	public User userLoginAndGetUser(String email, String pwd) {
		User user = ud.getUserByEmail(email);
		if (user == null)
			return null;
		else if (MD5.MD5Encode(pwd).equals(user.getPwd())) {
			return user;
		}
		return null;

	}

	public List<User> getAllUserIConcern(int myId) {
		return urd.getAllPublisherByObserverId(myId);
	}

	public User getUserInfo(int userId) {
		return ud.getUserById(userId);
	}

	public List<User> getAllUserConcernMe(int myId) {
		return urd.getAllObserverByPublisherId(myId);
	}
}
