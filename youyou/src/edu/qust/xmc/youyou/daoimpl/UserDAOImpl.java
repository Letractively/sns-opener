package edu.qust.xmc.youyou.daoimpl;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.beans.UserTheme;
public class UserDAOImpl implements UserDAO {
	private static SqlMapClient client = null;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			client = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			System.out.println("在userdao的static里面出错了");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		try {
			return client.queryForList("selectAllUsers");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void insertUser(User user) {
		try {
			client.insert("insertUser", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User getUserById(int id) {
		try {
			return (User) client.queryForObject("getUserById",id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public User getUserByEmail(String email) {
		try {
			return (User) client.queryForObject("getUserByEmail",email);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void updateTheme(int themeId,int userId) {

		try {
			UserTheme ut=new UserTheme(themeId,userId);
			client.update("updatTheme",ut);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
