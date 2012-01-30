package edu.qust.xmc.youyou.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class GetUserIConcernAction extends ActionSupport {
	@Override
	public String execute() throws Exception {

		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		UserService us = new UserServiceImpl();
		List<User> userList = us.getAllUserIConcern(user.getId());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allUserIConcern", userList);
		return "success";
	}
}
