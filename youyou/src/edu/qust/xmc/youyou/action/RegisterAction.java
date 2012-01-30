package edu.qust.xmc.youyou.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class RegisterAction extends ActionSupport {

	public String name;
	public String pwd;
	public String toopwd;
	public String email;
	public boolean isMan;

	@Override
	public String execute() throws Exception {

		if (!pwd.equals(toopwd)) {
			this.addFieldError("pwd", "注册密码和确认密码必须相同");
			return "input";
		}

		UserService us = new UserServiceImpl();
		// 检查此邮箱是否已经被人注册
		if (us.IsRegistedByEmail(email)) {
			this.addFieldError("email", "用户邮箱已经被注册过了");
			return "input";
		}
		// 注册
		User user = new User(name, pwd, email, isMan);
		if (us.userRegist(user)) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("msg", "用户注册成功，");
			return "login";
		}
		return null;
	}

	@Override
	public void validate() {
		if (this.getName().length() < 7 || this.getName().length() > 25
				|| null == this.getName() || "".equals(this.getName().trim())) {
			this.addFieldError("name", "用户姓名不能为空，且必须大于6个字母或者汉字小于25个字母或者汉字");
		}
		if (getPwd().length() < 7 || getPwd().length() > 25
				|| null == this.getPwd() || "".equals(this.getPwd().trim())) {
			this.addFieldError("pwd", "用户密码不能为空，且必须大于6个字母小于25个字母");
		}
		if (null == this.getEmail() || "".equals(this.getEmail().trim())) {
			this.addFieldError("email", "用户的邮箱格式不正确");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getToopwd() {
		return toopwd;
	}

	public void setToopwd(String toopwd) {
		this.toopwd = toopwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
}
