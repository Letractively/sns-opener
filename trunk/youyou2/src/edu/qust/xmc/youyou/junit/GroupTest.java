package edu.qust.xmc.youyou.junit;

import java.util.List;

import org.junit.Test;

import edu.qust.xmc.youyou.beans.Group;
import edu.qust.xmc.youyou.dao.GroupDAO;
import edu.qust.xmc.youyou.daoimpl.GroupDAOImpl;

public class GroupTest {
	@Test
	public void test(){
		GroupDAO gd=new GroupDAOImpl();
//		Group group = gd.getGroupByUserIdAndName(7, "shengren");
//		System.out.println(group.getGroupId());
		//gd.insertGroup(group);
		//gd.updateGroupByName(group);
//		List<Group> gl=gd.getAllGroupsByUserId(7);
//		for(Group g:gl){
//			System.out.println(g.getGroupName());
//		}
		gd.deleteByGroupId(5);
	}

}
