package co.test.com;

import java.util.ArrayList;

public class Youtuber extends User{
	private String username;
	private String pageID;
	private String email;
	private String subscribers;
	
	public  void setUsername(String uname) {
		this.username = uname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPageID(String pid) {
		this.pageID = pid;
	}
	
	public String getPageID() {
		return pageID;
	}
	
	
	public void setSubs(String subs) {
		this.subscribers = subs;
	}
}
