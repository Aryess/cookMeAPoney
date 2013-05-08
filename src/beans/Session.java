package beans;

import interfaces.Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.Users;


public class Session{
	protected User _user = null;
	protected boolean connected;
	
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	public boolean getConnected() {
		return this.connected;
	}
	public User getUser(){ return _user;}
	public Boolean isConnected() { return (_user != null); }
	public void setUser(User u) {this._user = u;}
	
/*
	public Boolean login(User u) {
		System.out.println(u);
		Users dao = new Users();
		if(u.getPwd() == dao.getUser(u.getLogin()).getPwd()) {
			//CONNECT
			this.setUser(u);
			this.connected = true;
			return true;
		}
		else {
			//DON'T CONNECT
			this.logout();
			return false;
		}	
	}//*/
	
	public void logout() {
		this.connected = false;
		this.setUser(null);
	}

}