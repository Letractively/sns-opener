package edu.qust.xmc.youyou.daoimpl;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import edu.qust.xmc.youyou.beans.Group;
import edu.qust.xmc.youyou.dao.GroupDAO;

public class GroupDAOImpl implements GroupDAO {
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
	public List<Group> getAllGroupsByUserId(int userId) {
			try {
				return client.queryForList("getAllGroupsByUserId",userId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
	public void insertGroup(Group group) {
			try {
				client.insert("insertGroup", group);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void updateGroupByName(Group group) {
			try {
				client.update("updateGroupByName", group);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public Group getGroupByUserIdAndName(int userId,String name){
			Group group=new Group(userId,name);
			try {
				return (Group) client.queryForObject("getGroupByUserIdAndName", group);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		
	}
	public void deleteByGroupId(int groupId) {
		 try {
			client.delete("deleteByGroupId", groupId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
