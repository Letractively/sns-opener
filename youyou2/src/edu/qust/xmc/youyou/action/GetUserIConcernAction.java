package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserPublic;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;
import edu.qust.xmc.youyou.util.Util;

public class GetUserIConcernAction extends ActionSupport {
	private int groupId;
	UserService us = new UserServiceImpl();
	
	public String getUserIConcernTop() throws Exception{
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<User> userList = us.getUserIConcernWithGroup(user.getId(), 0);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("userIConcernTop", userList);
		return "success";
	}
	public String getUserIConcernWithGroupJSON() throws Exception{
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<User> userList = us.getUserIConcernWithGroup(user.getId(),groupId);
		List<UserPublic> upl = Util.userToPublicList(userList);
		Gson gson = new Gson();
		String result = gson.toJson(upl);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print(result);
		PrinterUtil.close(out);
		return null;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
}
