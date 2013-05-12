package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import beans.Comment;
import beans.User;
import dao.Comments;
import dao.Users;

@ManagedBean
@RequestScoped

public class DetailsCtrl{
	protected Comment comm = new Comment();
	protected Comments DAO = new Comments();

	public void setComment(Comment comm) {this.comm.clone(comm);}
	public Comment getComment() {return this.comm;}
	
}