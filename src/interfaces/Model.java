package interfaces;

import dao.DAO;

public abstract class Model {
	protected DAO DAO;
	
	public String create() {
		System.out.println("Model: " + this);
		return this.DAO.create(this).toString();
	}
	
	public abstract void clone(Model m);
	
	public void load(int id) {
		this.clone(this.DAO.getItem(id));
	}
	
	public Boolean update() {
		return this.DAO.update(this);
	}
	
	public Boolean delete() {
		return this.DAO.delete(this);
	}
	
	public void setDao(DAO DAO) { this.DAO = DAO; }
	public DAO getDao() { return this.DAO; }
}
