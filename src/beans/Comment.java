package beans;

import interfaces.Model;

public class Comment extends Model{
	private Integer _id;
	private String _txt;
	private Integer _rating;
	private Integer _idUser;
	private Integer _idReceipe;
	
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
	
	public Integer getId() {return _id;}
	public String getTxt() {return _txt;}
	public Integer getRating() {return _rating;}
	public Integer getIdUser() {return _idUser;}
	public Integer getIdReceipe() {return _idReceipe;}

	public void setId(Integer _id) {this._id = _id;}
	public void setTxt(String _txt) {this._txt = _txt;}
	public void setRating(Integer _rating) {this._rating = _rating;}
	public void setIdUser(Integer _idUser) {this._idUser = _idUser;}
	public void setIdReceipe(Integer _idReceipe) {this._idReceipe = _idReceipe;}
	
	public void setInfo(Integer id, String txt, Integer rating, Integer idU, Integer idR) {
		this._id = id;
		this._txt = txt;
		this._rating = rating;
		this._idUser = idU;
		this._idReceipe = idR;
	}
	
	public String toString() {
		String toS = "Comment id: " + this._id + "\n";
		toS += "Txt: " + this._txt + "\n";
		toS += "Rating " + this._rating + "\n"; 
		toS += "idUsers: " + this._idUser + "\n";
		toS += "idReceipes: " + this._idReceipe + "\n";
		return toS;
	}
}
