package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.RateEvent;

import beans.Receipe;

public class SearchCtrl {

	private Integer rating=0;
	private Integer cookDuration=0000;
	private Integer nbPpl=0;
	private Integer type=0;
	private Receipe DAO = new Receipe();
	
	SearchCtrl(){
		this.rating = 0;
		this.cookDuration = 0;
		this.nbPpl = 0;
		this.type = 0;
		
	}
	
	
	public Receipe search(){
		//DOSTUFF
		return this.DAO;
	}
	
	
	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getCookDuration() {
		return cookDuration;
	}

	public void setCookDuration(Integer cookDuration) {
		this.cookDuration = cookDuration;
	}

	public Integer getNbPpl() {
		return nbPpl;
	}

	public void setNbPpl(Integer nbPpl) {
		this.nbPpl = nbPpl;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
}
