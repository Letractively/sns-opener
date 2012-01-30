package edu.qust.xmc.youyou.action;

import java.util.Map;

import org.apache.struts2.jasper.tagplugins.jstl.core.Redirect;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class LoginAction extends ActionSupport {

	public String email;
	public String pwd;

	UserService us = new UserServiceImpl();

	@Override
	public String execute() throws Exception {

		User user = us.userLoginAndGetUser(email, pwd);
		if (user != null) {
			// 将user对象存入session
			Map session = (Map) ActionContext.getContext().get(
					ActionContext.SESSION);
			session.put("user", user);
			// 将在线用户数计入application对象
			Map app = ActionContext.getContext().getApplication();
			Integer userNum = (Integer) app.get("userNum");
			if (userNum == null) {
				app.put("userNum", 1);
			} else {
				app.put("userNum", userNum += 1);
			}

			return "success";
		} else {
			this.addActionError("用户名或者用户密码错误");
			return "login";
		}
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}
}
