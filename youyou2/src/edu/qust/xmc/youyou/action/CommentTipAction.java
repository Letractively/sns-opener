package edu.qust.xmc.youyou.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.sun.org.apache.xml.internal.serialize.Printer;

import edu.qust.xmc.youyou.beans.CommentTip;
import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.service.CommentService;
import edu.qust.xmc.youyou.serviceImpl.CommentServiceImpl;
import edu.qust.xmc.youyou.util.PrinterUtil;

public class CommentTipAction {
	private int tipId;
	CommentService cs = new CommentServiceImpl();

	public String getCommentTipJSON() throws Exception {
		Map session=ActionContext.getContext().getSession();
		User user=(User)session.get("user");
		List<CommentTip> commentTipList = cs.getCommentTips(user.getId());
		Gson gson = new Gson();
		String result = gson.toJson(commentTipList);
		PrintWriter out = PrinterUtil.getPrintWriter();
		out.print(result);
		PrinterUtil.close(out);
		return null;
	}
	public String deleteCommentTipJSON() throws Exception{
		cs.readedTip(tipId);
		return null;
	}
	public int getTipId() {
		return tipId;
	}
	public void setTipId(int tipId) {
		this.tipId = tipId;
	}

}
