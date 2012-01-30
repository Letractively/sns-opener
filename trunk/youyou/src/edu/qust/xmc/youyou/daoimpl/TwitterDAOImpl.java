package edu.qust.xmc.youyou.daoimpl;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.dao.TwitterDAO;

;

public class TwitterDAOImpl implements TwitterDAO {
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

	public void insertTwitter(TwitterMessage twitterMsg) {
		try {
			client.insert("insertTwitter", twitterMsg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Message> getAllTwitter() {
		try {
			return client.queryForList("getAllTwitter");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Message> getAllTwitterByPublisherId(int userId) {
		try {
			return client.queryForList("getAllTwitterByUserId",userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Message> getAllTwitterByObserverId(int userId) {
		try{
			return client.queryForList("getAllTwitterByObserverId",userId);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

}
