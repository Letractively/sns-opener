package edu.qust.xmc.youyou.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.qust.xmc.youyou.beans.User;
import edu.qust.xmc.youyou.beans.UserPublic;
import edu.qust.xmc.youyou.service.UserService;
import edu.qust.xmc.youyou.serviceImpl.UserServiceImpl;
import edu.qust.xmc.youyou.util.Util;

public class GsonTest {

	@Test
	public void gsonTest(){
//		UserService us=new UserServiceImpl();
//		List<User> userList = us.getUserIConcernWithGroup(7, 0);
//		List<UserPublic> upl=Util.userToPublicList(userList);
		Gson gson=new Gson();
//		String result=gson.toJson(upl);
//		System.out.println(result);
//		for(User u:userList){
//			
//			System.out.println("\n"+u.toString() );
//		}
		
//		Point p1=new Point(43,3);
//		Point p2=new Point(442,434);
//		List<Point> pList=new ArrayList<Point>();
//		pList.add(p1);
//		pList.add(p2);
//		System.out.println(gson.toJson(pList));
		String json="[{x:43,y:3},{x:442,y:434}]";
		
		List<Point> pList=gson.fromJson(json, new TypeToken<List<Point>>(){}.getType());
		
		for(Point p:pList){
			System.out.println(p.toString());
		}
		
	}
}

class Point {
	int x;
	int y;
	public Point(){
		
	}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
}
