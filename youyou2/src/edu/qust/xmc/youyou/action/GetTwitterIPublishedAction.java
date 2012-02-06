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
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class GetTwitterIPublishedAction extends ActionSupport {
	private int groupId;
	TwitterService ts = new TwitterServiceImpl();
	
	public String getTwitterIPublishedTop() throws Exception {
		Map session = (Map) ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		List<TwitterMessage> listMsg = ts.getTwittersIPublishedByGroup(user.getId(), 0);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("TwitterIPublish", listMsg);
		return "success";
	}
	public String getTwitterIPublishedJSON() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<TwitterMessage> listMsg = ts.getTwittersIPublishedByGroup(user.getId(),groupId);
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
	public TwitterService getTs() {
		return ts;
	}
	public void setTs(TwitterService ts) {
		this.ts = ts;
	}
}
