package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class GetUserInfoAction extends ActionSupport {
	private int uid;
	private int groupId;
	TwitterService ts = new TwitterServiceImpl();
	UserService us = new UserServiceImpl();

	public String getUserInfo() throws Exception {
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
		List<TwitterMessage> listMsg = ts.getTwittersIPublishedByGroup(uid, 0);
		request.setAttribute("allTwitter", listMsg);
		
		return "success";
	}
	public String getTwitterPublishedByUserJSON()throws Exception{
		
		List<TwitterMessage> listMsg = ts.getTwittersIPublishedByGroup(uid,groupId);
		Gson gson=new Gson();
		String result=gson.toJson(listMsg);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print(result);
		return null;
	}
	public int getGroupId() {
		return groupId;
	}
	
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
}
