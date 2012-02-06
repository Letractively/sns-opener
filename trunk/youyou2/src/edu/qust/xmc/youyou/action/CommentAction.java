package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.qust.xmc.youyou.beans.Comment;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.CommentService;
import edu.qust.xmc.youyou.serviceImpl.CommentServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class CommentAction extends ActionSupport {
	private int twitterId;
	private String content;
	CommentService cs = new CommentServiceImpl();

	public String getCommentJSON() throws Exception {
		List<Comment> commentList = cs.getComments(twitterId);
		Gson gson = new Gson();
		String result = gson.toJson(commentList);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print(result);
		PrinterUtil.close(out);
		return null;
	}

	public String addCommentJSON() throws Exception {
		Map session = (Map) ActionContext.getContext().get(
				ActionContext.SESSION);
		User user = (User) session.get("user");
		cs.addComment(user.getId(), twitterId, content);

		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print("{result:'success'}");
		PrinterUtil.close(out);
		return null;
	}

	public int getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(int twitterId) {
		this.twitterId = twitterId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
