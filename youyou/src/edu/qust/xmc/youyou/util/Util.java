package edu.qust.xmc.youyou.util;

import java.util.ArrayList;
import java.util.List;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserPublic;

public class Util {
	public static List<UserPublic> userToPublicList(List<User> userList) {

		List<UserPublic> upl = new ArrayList<UserPublic>();
		for (User u : userList) {
			upl.add(u.toUserPublic());
		}
		return upl;

	}
}
