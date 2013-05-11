package beans;

import interfaces.Model;

public class Comment extends Model{
	private Integer id;
	private String txt;
	private Integer rating;
	private Integer idUser;
	private Integer idReceipe;
	
	public Comment(){
	}
	
	public Comment(Integer id, String txt, Integer rating, Integer idU, Integer idR){
		this.setInfo(id, txt, rating, idU, idR);
	}
	
	@Override
	public void clone(Model m) {
		Comment c = (Comment) m;
		this.setInfo(c.getId(), c.getTxt(), c.getRating(), c.getIdUser(), c.getIdUser());
		
	}
	
	public Integer getId() {return id;}
	public String getTxt() {return txt;}
	public Integer getRating() {return rating;}
	public Integer getIdUser() {return idUser;}
	public Integer getIdReceipe() {return idReceipe;}

	public void setId(Integer id) {this.id = id;}
	public void setTxt(String txt) {this.txt = txt;}
	public void setRating(Integer rating) {this.rating = rating;}
	public void setIdUser(Integer idUser) {this.idUser = idUser;}
	public void setIdReceipe(Integer idReceipe) {this.idReceipe = idReceipe;}
	
	public void setInfo(Integer id, String txt, Integer rating, Integer idU, Integer idR) {
		this.id = id;
		this.txt = txt;
		this.rating = rating;
		this.idUser = idU;
		this.idReceipe = idR;
	}
	
	public String toString() {
		String toS = "Comment id: " + this.id + "\n";
		toS += "Txt: " + this.txt + "\n";
		toS += "Rating " + this.rating + "\n"; 
		toS += "idUsers: " + this.idUser + "\n";
		toS += "idReceipes: " + this.idReceipe + "\n";
		return toS;
	}
}
