package beans;

import dao.Comments;
import interfaces.Model;

public class Comment extends Model{
	private Integer id;
	private String txt;
	private Integer rating;
	private Integer idUser;
	private String author;
	private Integer idReceipe;
	
	public Comment(){
	}
	
	public Comment(Integer id, String txt, Integer rating, Integer idU, Integer idR){
		this.setInfo(id, txt, rating, idU, idR);
		this.DAO = new Comments();
	}
	
	@Override
	public void clone(Model m) {
		Comment c = (Comment) m;
		this.setInfo(c.getId(), c.getTxt(), c.getRating(), c.getIdUser(), c.getIdUser());
		this.DAO = new Comments();
	}
	
	public Integer getId() {return id;}
	public String getTxt() {return txt;}
	public Integer getRating() {return rating;}
	public Integer getIdUser() {return idUser;}
	public Integer getIdReceipe() {return idReceipe;}
	public String getAuthor() {return author;}

	public void setId(Integer id) {this.id = id;}
	public void setTxt(String txt) {this.txt = txt;}
	public void setRating(Integer rating) {this.rating = rating;}
	public void setIdUser(Integer idUser) {this.idUser = idUser;}
	public void setIdReceipe(Integer idReceipe) {this.idReceipe = idReceipe;}
	public void setAuthor(String auth) {this.author = auth;}
	
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
