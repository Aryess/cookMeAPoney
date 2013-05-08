package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.User;
import dao.Users;

@ManagedBean
@SessionScoped

public class LoginCtrl{
	protected User user;
	protected String username;
	protected String pwd;
	protected Users DAO = new Users();

	public void setUser(User u) { this.user = u;}
	public void setUsername(String un) { this.username = un;}
	public void setPwd(String pwd) {this.pwd = pwd; }
	
	public User getUser() { return this.user; }
	public String getUsername() { return this.username; }
	public String getPwd() { return this.pwd; }
	
	public void signin() {
		this.user = DAO.getUser(this.username, this.pwd);
		
		if(user != null) {
			System.out.println( "Loged in as : " + this.user.getFName() + " " + this.user.getLName());
		} else {
			System.out.println("Loggin failed for " + this.username + ":" + this.pwd);
		}
	}
	
	public void signout() {
		this.user = null;
		this.username = "";
		this.pwd = "";
	}
	
}