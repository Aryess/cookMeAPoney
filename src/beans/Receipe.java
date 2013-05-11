package beans;

import interfaces.Model;

import dao.Receipes;


public class Receipe extends Model{

	/**
	 * 
		Column	Type	Comment
		idreceipes	int(11) Auto Increment	 
		title	varchar(45)	 
		sumup	varchar(250) NULL	 
		description	varchar(500) NULL	 
		imageref	varchar(45) NULL	 
		nbofperson	int(11)	 
		cooktype	varchar(100)	 
		cookexpertise	int(11)	 
		preparationduration	int(11)	 
	 */
	private Integer id;
	private String title;
	private String sumup;
	private String description;
	private String imageref;
	private Integer nbofperson;
	private String cooktype;
	private Integer cookexpertise;
	private Integer  preparationduration;
	

	public Receipe() {
		super();
		/*
		this._title = "Derp";
		this._description = "Erp Derp Poneyz";
		this._imageref = "/cookMeAPoneyLocal/img/cookpony.png";
		this._nbofperson = 0;
		this._cooktype = 0;
		this._cookexpertise = 0;
		this._preparationduration = 0000;
		this._ingredients = new ArrayList<String>();
		this._comments = new ArrayList<Comment>();
		_comments.add(new Comment());
		//*/
	}
	
	public Receipe(int id, String title, String sumup, String desc, String imgRef, Integer nbPers, String cookType, Integer cookExp, Integer duration) {
		super();
		this.setInfos(id, title, sumup, desc, imgRef, nbPers, cookType, cookExp, duration);
		this.setDao(new Receipes());
	}


	public Integer getId() {return id;}
	public String getTitle() {return title;}
	public String getSumup() {return sumup;}
	public String getDescription() {return description;}
	public String getImageref() {return imageref;}
	public Integer getNbofperson() {return nbofperson;}
	public String getCooktype() {return cooktype;}
	public Integer getCookexpertise() {return cookexpertise;}
	public Integer getPreparationduration() {return preparationduration;}

	public void setId(Integer id) {this.id = id;}
	public void setTitle(String title) {this.title = title;}
	public void setSumup(String sumup) {this.sumup = sumup;}
	public void setDescription(String description) {this.description = description;}
	public void setImageref(String imageref) {this.imageref = imageref;}
	public void setNbofperson(Integer nbofperson) {this.nbofperson = nbofperson;}
	public void setCooktype(String cooktype) {this.cooktype = cooktype;}
	public void setCookexpertise(Integer cookexpertise) {this.cookexpertise = cookexpertise;}
	public void setPreparationduration(Integer preparationduration) {this.preparationduration = preparationduration;}
	
	
	private void setInfos(int id, String title, String sumup, String desc, String imgRef, Integer nbPers, String cookType, Integer cookExp, Integer duration) {
		this.setId(id);
		this.setTitle(title);
		this.setSumup(sumup);
		this.setDescription(desc);
		this.setImageref(cookType);
		this.setNbofperson(nbPers);
		this.setCooktype(cookType);
		this.setCookexpertise(cookExp);
		this.setPreparationduration(duration);
	}
	
	public String toString() {
		String toS = "Recipe id: " + this.id + "\n";
		toS += "Title: " + this.title + "\n";
		toS += "Sumup " + this.sumup + "\n"; 
		toS += "Type: " + this.cooktype + "\n";
		toS += "Exp: " + this.cookexpertise + "\n";
		toS += "Duration: " + this.preparationduration + "\n";
		return toS;
	}
	
	public void clone(Model item) {
		Receipe r = (Receipe) item;
		this.setInfos(r.getId(), r.getTitle(), r.getSumup(), r.getDescription(), r.getImageref(), r.getNbofperson(), r.getCooktype(), r.getCookexpertise(), r.getPreparationduration());
	}
}
