package edu.qust.xmc.youyou.beans;

import java.util.List;

public class CommentTip {
	private int commentTipId; //即评论的id
	private int becommentedId;
	private int commenterId;
	private String commenterName;
	private int twitterId;
	private String twitterContent;
	private List<Comment> commentList;

	@Override
	public String toString() {
		return commenterName + " comment to " + becommentedId + " that: "
				+ twitterContent;
	}

	public int getCommentTipId() {
		return commentTipId;
	}

	public void setCommentTipId(int commentTipId) {
		this.commentTipId = commentTipId;
	}

	public int getBecommentedId() {
		return becommentedId;
	}

	public void setBecommentedId(int becommentedId) {
		this.becommentedId = becommentedId;
	}

	public int getCommenterId() {
		return commenterId;
	}

	public void setCommenterId(int commenterId) {
		this.commenterId = commenterId;
	}

	public String getCommenterName() {
		return commenterName;
	}

	public void setCommenterName(String commenterName) {
		this.commenterName = commenterName;
	}

	public String getTwitterContent() {
		return twitterContent;
	}

	public void setTwitterContent(String twitterContent) {
		this.twitterContent = twitterContent;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public int getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(int twitterId) {
		this.twitterId = twitterId;
	}


}
