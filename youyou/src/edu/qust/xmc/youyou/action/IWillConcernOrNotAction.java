package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.config.entities.ActionConfig;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class IWillConcernOrNotAction extends ActionSupport {
	private int uid;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	UserService us = new UserServiceImpl();

	public String IWillConcern() throws Exception {
		User user = us.getUserInfo(uid);
		Map session = ActionContext.getContext().getSession();
		User follow = (User) session.get("user");
		user.addObserver(follow);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print("{result:'success'}");
		PrinterUtil.close(out);
		return null;
	}

	public String IWillNotConcern() throws Exception {
		Map session = ActionContext.getContext().getSession();
		User follow = (User) session.get("user");
		follow.deleteObserverById(uid);

		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print("{result:'success'}");
		PrinterUtil.close(out);
		return null;
	}
}
