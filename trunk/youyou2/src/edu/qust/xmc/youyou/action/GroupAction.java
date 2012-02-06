package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.Group;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.GroupDAO;
import edu.qust.xmc.youyou.daoimpl.GroupDAOImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class GroupAction extends ActionSupport {
	private int groupId;
	private String name;
	private GroupDAO gd = new GroupDAOImpl();

	public String getAllGroups() {
		Map session = (Map) ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		List<Group> groupList = gd.getAllGroupsByUserId(user.getId());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("groupList", groupList);
		return "success";
	}

	public String createGroupNameJSON() throws Exception {
		if (!"".equals(this.getName().trim()) && null != this.getName()) {
			Map session = (Map) ActionContext.getContext().getSession();
			User user = (User) session.get("user");
			Group group = new Group(user.getId(), name);
			gd.insertGroup(group);
			group=gd.getGroupByUserIdAndName(user.getId(), name);
			PrintWriter out = PrinterUtil.getPrintWriter();
			out.print("{groupId:'"+group.getGroupId()+"'}");
			PrinterUtil.close(out);
		}
		return null;
	}

	public String renameGroupNameJSON() throws Exception {
		if (!"".equals(this.getName().trim()) && null != this.getName()) {
			Group group=new Group(groupId,0,name);
			gd.updateGroupByName(group);
			PrintWriter out = PrinterUtil.getPrintWriter();
			out.print("{result:'success'}");
			PrinterUtil.close(out);
		}
		return null;
	}
	public String deleteGroupJSON() throws Exception{
		gd.deleteByGroupId(groupId);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print("{result:'success'}");
		PrinterUtil.close(out);
		return null;
	}
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
