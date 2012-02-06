package edu.qust.xmc.youyou.daoimpl;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserRelation;
import edu.qust.xmc.youyou.dao.UserRelationDAO;

public class UserRelationDAOImpl implements UserRelationDAO {
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

	public boolean addUserRelation(UserRelation userRelation) {

		try {
			client.insert("insertUserRelation", userRelation);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public List<User> getAllPublisherByObserverId(int userId) {
		try {
			return client.queryForList("getAllPublisherByObserverId", userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public void delUserRelation(UserRelation ur) {

		try {
			client.delete("delUserRelationByIds", ur);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<User> getAllObserverByPublisherId(int userId) {
		try {
			return client.queryForList("getAllObserverByPublisherId", userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<User> getObserverByPublisherIdWithGroup(int id, int start,
			int length) {
		try {
			return client.queryForList("getObserverByPublisherIdWithGroup", id,
					start, length);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<User> getPublisherByObserverIdWithGroup(int id, int start,
			int length) {
		try {
			return client.queryForList("getPublisherByObserverIdWithGroup", id,
					start, length);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getGroupNameByObserverIdPublisherId(int observerId,
			int publisherId) {
		UserRelation userRelation = new UserRelation(publisherId, observerId);
		try {
			return (String) client.queryForObject(
					"getGroupNameByObserverIdPublisherId", userRelation);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
