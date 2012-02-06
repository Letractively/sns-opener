package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;

import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class CheckEmailAction extends ActionSupport {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	UserService us = new UserServiceImpl();

	@Override
	public String execute() throws Exception {

		PrintWriter out = PrinterUtil.getPrintWriter();
		if (us.IsRegistedByEmail(email)) {
			out.print("{isRegisted:true}");
		} else {
			out.print("{isRegisted:false}");
		}
		PrinterUtil.close(out);
		return null;
	}
}
