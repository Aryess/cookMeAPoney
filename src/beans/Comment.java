package beans;

import java.util.Date;

public class Comment {
	private String _txt;
	private Integer _rating;
	private Date _written;
	public Date get_written() {
		return _written;
	}

	public void set_written(Date _written) {
		this._written = _written;
	}
	private User _writer;
	
	public Comment(){
		this._txt=" Lorem ipsum dolor sit amet, consectetur adipiscing elit. In tincidunt venenatis eros, at pretium nibh rutrum at. Vestibulum faucibus, lacus eu dignissim tempor, purus mauris fermentum sapien, quis mollis nibh dui vitae metus. Vestibulum vestibulum lectus id odio rutrum eleifend. In laoreet sapien ut enim mollis suscipit. Duis urna nibh, ornare sit amet mollis sit amet, aliquam nec nisl. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Proin eu nibh lacus, sed suscipit erat. Quisque nulla nisl, pharetra eu euismod sed, interdum et eros."+

				"Nullam dictum ullamcorper facilisis. Sed tempor, massa vel euismod iaculis, dolor enim posuere augue, vitae accumsan orci lectus mattis tortor. Nullam sodales rhoncus sodales. Mauris justo diam, tristique id vehicula non, iaculis quis sem. Maecenas risus augue, tincidunt vel ornare at, eleifend ut ipsum. Cras malesuada, nibh nec scelerisque feugiat, dui dui placerat mauris, ac dignissim odio quam nec tellus. Etiam fringilla nibh at felis tincidunt vel pretium velit aliquet."; 
this._rating=1;
		
	}
	
	public String get_txt() {
		return _txt;
	}
	public void set_txt(String _txt) {
		this._txt = _txt;
	}
	public Integer get_rating() {
		return _rating;
	}
	public void set_rating(Integer _rating) {
		this._rating = _rating;
	}
	public User get_writer() {
		return _writer;
	}
	public void set_writer(User _writer) {
		this._writer = _writer;
	}
	
}
