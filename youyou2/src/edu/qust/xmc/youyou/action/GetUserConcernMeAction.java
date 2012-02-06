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

public class GetUserConcernMeAction extends ActionSupport {
	private int groupId;
	UserService us = new UserServiceImpl();

	public String getUserConcernMeTop() throws Exception {

		Map session = (Map) ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		List<User> userList = us.getAllUserConcernMe(user.getId());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allUserConcernMe", userList);
		return "success";

	}

	public String getUserConcernMeWithGroupJSON() throws Exception {
		Map session = (Map) ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		List<User> userList = us.getUserConcernMeWithGroup(user.getId(), groupId);
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
