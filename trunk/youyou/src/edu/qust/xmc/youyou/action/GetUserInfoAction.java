package edu.qust.xmc.youyou.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;

public class GetUserInfoAction extends ActionSupport {
	private int uid;
	TwitterService ts = new TwitterServiceImpl();
	UserService us = new UserServiceImpl();

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String execute() throws Exception {
		//检查me与uid的关系,并作出相应的处理
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = us.getUserInfo(uid);
		request.setAttribute("user", user);
		Map session = ActionContext.getContext().getSession();
		User me = (User) session.get("user");
		boolean isConcerned = false;
		for (User u : me.getFollows()) {
			if (u.getId() == uid) {
				isConcerned = true;
				break;
			}
		}
		if (isConcerned) {
			request.setAttribute("isConcerned", true);
		} else {
			request.setAttribute("isConcerned", false);
		}
		//将所有的uid发送的微博送入request对象,以便显示
		List<Message> listMsg = ts.getAllTwitterPublishedByUserId(uid);
		request.setAttribute("allTwitter", listMsg);
		
		return "success";
	}
}
