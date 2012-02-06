package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.dao.UserDAO;
import edu.qust.xmc.youyou.daoimpl.UserDAOImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class ThemeAction extends ActionSupport {
	private int themeId;
	UserDAO ud = new UserDAOImpl();

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	public String changeTheme() throws Exception {
		PrintWriter out = PrinterUtil.getPrintWriter();
		Map session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		user.setThemeId(themeId);
		ud.updateTheme(themeId, user.getId());
		out.print("{result:'success'}");
		PrinterUtil.close(out);
		return null;

	}
}
