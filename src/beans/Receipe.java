package beans;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
@ManagedBean
public class Receipe {

	private String _title = "";
	private String _description ="";
	private String _imageref ="";
	private Integer _nbofperson= 0 ;
	private Integer _cooktype = 0;
	private Integer _cookexpertise = 0;
	private String  _preparationduration= "00:00";
	private ArrayList<String> _ingredients= new ArrayList<String>();
	
	public Receipe() {
		super();
		this._title = "Derp";
		this._description = "Erp Derp Poneyz";
		this._imageref = "";
		this._nbofperson = 0;
		this._cooktype = 0;
		this._cookexpertise = 0;
		this._preparationduration = "0000";
		this._ingredients = new ArrayList<String>();
	}
	
	public String get_title() {
		return _title;
	}
	public String get_description() {
		return _description;
	}
	public String get_imageref() {
		return _imageref;
	}
	public Integer get_nbofperson() {
		return _nbofperson;
	}
	public Integer get_cooktype() {
		return _cooktype;
	}
	public Integer get_cookexpertise() {
		return _cookexpertise;
	}
	public String get_preparationduration() {
		return _preparationduration;
	}
	public ArrayList<String> get_ingredients() {
		return _ingredients;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public void set_imageref(String _imageref) {
		this._imageref = _imageref;
	}
	public void set_nbofperson(Integer _nbofperson) {
		this._nbofperson = _nbofperson;
	}
	public void set_cooktype(Integer _cooktype) {
		this._cooktype = _cooktype;
	}
	public void set_cookexpertise(Integer _cookexpertise) {
		this._cookexpertise = _cookexpertise;
	}
	public void set_preparationduration(String _preparationduration) {
		this._preparationduration = _preparationduration;
	}
	public void set_ingredients(ArrayList<String> _ingredients) {
		this._ingredients = _ingredients;
	}
	
	

	
}
