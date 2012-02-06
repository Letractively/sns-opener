package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserPublic;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;
import edu.qust.xmc.youyou.util.Util;

public class SearchAction extends ActionSupport {
	private String input;
	UserDAO ud = new UserDAOImpl();

	@Override
	public String execute() throws Exception {
		List<User> ul = ud.getAllUserMatched(input);
		List<UserPublic> upl = Util.userToPublicList(ul);
		Gson gson = new Gson();
		PrintWriter out = PrinterUtil.getPrintWriter();
		if(!"".equals(input)){
			out.print(gson.toJson(upl));
		}
		PrinterUtil.close(out);
		return null;

	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

}
