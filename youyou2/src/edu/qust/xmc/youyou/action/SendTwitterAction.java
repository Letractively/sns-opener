package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.Map;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.TwitterService;
import edu.qust.xmc.youyou.serviceImpl.TwitterServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class SendTwitterAction extends ActionSupport {
	public String twitterContent;

	TwitterService ts = new TwitterServiceImpl();

	public String getTwitterContent() {
		return twitterContent;
	}

	public void setTwitterContent(String twitterContent) {
		this.twitterContent = twitterContent;
	}

	@Override
	public String execute() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");

		PrintWriter out = PrinterUtil.getPrintWriter();
		if (user != null&&twitterContent.length()<=255) {
			ts.addTwitter(user, twitterContent);
			out.print("{result:'success'}");
		} else {
			out.print("{result:error}");
		}

		Thread.sleep(2000);

		PrinterUtil.close(out);
		return null;
	}
}
