package controllers;


import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import dao.Receipes;

import beans.Receipe;

@ManagedBean
@SessionScoped

public class SearchCtrl {

	private Integer rating;
	private Integer cookDuration;
	private String maskDuration;
	private Integer nbPpl;
	private Integer type;
	private ArrayList<Receipe> result;
	private Receipes DAO = new Receipes();
	
	public SearchCtrl(){
		this.resetSearch();
	}
	
	
	public void search(){
		System.out.println("Rating: " + rating);
		System.out.println("Duration: " + cookDuration);
		System.out.println("nbPpl: " + nbPpl);
		System.out.println("Type: " + type);
		System.out.println("Mask: " + maskDuration);
		
		this.result = this.DAO.getReceipes(cookDuration, nbPpl, rating, type.toString());
	}
	
	public void resetSearch() {
		this.rating = 0;
		this.cookDuration = 180;
		this.maskDuration = "";
		this.nbPpl = 0;
		this.type = 0;
		this.result = null;
	}
	
	public Integer getRating() {return rating;}
	public Integer getCookDuration() {return cookDuration;}
	public Integer getNbPpl() {return nbPpl;}
	public Integer getType() {return type;}
	public String getMaskDuration() {return maskDuration;}
	public ArrayList<Receipe> getResult() {return result;}
	
	public void setRating(Integer rating) {this.rating = rating;}
	public void setCookDuration(Integer cookDuration) {this.cookDuration = 180;}//cookDuration;}
	public void setNbPpl(Integer nbPpl) {this.nbPpl = nbPpl;}
	public void setType(Integer type) {this.type = type;}
	public void setMaskDuration(String mask) {
		this.maskDuration = mask;
		String[] time = this.maskDuration.split(":");
		this.cookDuration = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
	}
	public void setResult(ArrayList<Receipe> res) {this.result = res;}

}
