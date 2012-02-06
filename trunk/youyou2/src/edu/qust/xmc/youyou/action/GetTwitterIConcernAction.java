package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.Group;
import edu.qust.xmc.youyou.beans.TwitterMessage;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.GroupDAO;
import edu.qust.xmc.youyou.daoimpl.GroupDAOImpl;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class GetTwitterIConcernAction extends ActionSupport {
	private int partId;
	private int groupId;
	TwitterService ts = new TwitterServiceImpl();
	GroupDAO gd = new GroupDAOImpl();

	public String getTwitterIConcernTop() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<TwitterMessage> listMsg = ts.getTwittersIConcernTop(user.getId());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("TwitterIConcernTop", listMsg);

		List<Group> groupList = gd.getAllGroupsByUserId(user.getId());
		request.setAttribute("groups", groupList);
		return "success";
	}

	public String getAllTwitterIConcernJSON() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<TwitterMessage> listMsg = ts.getAllTwitterIconcern(user.getId());
		Gson gson = new Gson();
		String result = gson.toJson(listMsg);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print(result);
		PrinterUtil.close(out);
		System.out.println("partId=" + partId + " groupId=" + groupId);
		return null;
	}

	public String getTwitterIConcernWithGroupJSON() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		List<TwitterMessage> listMsg = ts.getTwitterIConcernWithGroup(user
				.getId(), partId, groupId);
		Gson gson = new Gson();
		String result = gson.toJson(listMsg);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print(result);
		PrinterUtil.close(out);

		return null;
	}

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

}
