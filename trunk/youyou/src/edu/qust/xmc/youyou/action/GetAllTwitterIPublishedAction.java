package edu.qust.xmc.youyou.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.Message;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;

public class GetAllTwitterIPublishedAction extends ActionSupport {
	TwitterService ts = new TwitterServiceImpl();

	@Override
	public String execute() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<Message> listMsg = ts.getAllTwitterPublishedByUserId(user.getId());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allTwitter", listMsg);
		return "success";
	}
}
