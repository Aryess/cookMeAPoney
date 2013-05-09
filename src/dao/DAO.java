package dao;

import interfaces.Model;

import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class DAO{
	protected String tableName;
	protected String idField;
	protected java.sql.Connection conn;
	protected java.sql.Statement DB;
	
	public DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/binome26", "binome26",
					"binome26");
			 DB = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Unknown exception");
		}
	}
	
	abstract public Boolean create(Model item);
	
	public ArrayList<HashMap<String, String>> read() {
		java.sql.ResultSet rs;
		ResultSetMetaData resultMeta;
		ArrayList<HashMap<String, String>> resultData = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> row = new HashMap<String, String>();
		int nbCol = 0;
		String query = "SELECT * FROM " + this.tableName;
		
		try {
			rs = DB.executeQuery(query);
			resultMeta= rs.getMetaData();
			nbCol = resultMeta.getColumnCount();
			int y = 0;
			
			while (rs.next()) {
				y++;
				for (int i = 1; i <= nbCol; i++) {
					String val = "";
					if(rs.getObject(i) != null)
						val = rs.getObject(i).toString();
					row.put(resultMeta.getColumnName(i), val);
				}
				
				//resultData.add(row);
				resultData.add(new HashMap<String, String>(row));
				row.clear();
			}System.out.println(query + ", nbCol: " + nbCol + ", nbRow: " + y);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return resultData;
	}
	
	public HashMap<String, String> read(int id) {
		java.sql.ResultSet rs;
		ResultSetMetaData resultMeta;
		HashMap<String, String> row = new HashMap<String, String>();
		int nbCol = 0;
		String query = "SELECT * FROM " + this.tableName + " WHERE " + this.idField + " = '" + id + "' LIMIT 1";
		System.out.println(query);
		try {
			rs = DB.executeQuery(query);
			resultMeta= rs.getMetaData();
			nbCol = resultMeta.getColumnCount();
			
			while (rs.next()) {
				for (int i = 1; i <= nbCol; i++) {
					String val = "";
					if(rs.getObject(i) != null)
						val = rs.getObject(i).toString();
					row.put(resultMeta.getColumnName(i), val);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	
	abstract public Boolean update(Model item);
	
	
	public Boolean delete(int id) {
		int rs = 0;
		try {
			rs = DB.executeUpdate("DELETE FROM " + this.tableName + " WHERE " + this.idField + " = '" + id + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Rs : " + rs);
		return (rs == 1);
	}
	
	public HashMap<String, String> getLast() {
		java.sql.ResultSet rs;
		ResultSetMetaData resultMeta;
		HashMap<String, String> row = new HashMap<String, String>();
		int nbCol = 0;
		String query = "SELECT * FROM " + this.tableName + " ORDER BY " + this.idField + " DESC LIMIT 1";
		System.out.println(query);
		try {
			rs = DB.executeQuery(query);
			resultMeta= rs.getMetaData();
			nbCol = resultMeta.getColumnCount();
			
			while (rs.next()) {
				for (int i = 1; i <= nbCol; i++) {
					String val = "";
					if(rs.getObject(i) != null)
						val = rs.getObject(i).toString();
					row.put(resultMeta.getColumnName(i), val);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	abstract public Boolean delete(Model m);
	
	public abstract Model getItem(int itemId);

	public abstract ArrayList<Model> getItems();
	
	
	
}
