package debug;

import interfaces.Model;

import java.util.ArrayList;

import dao.Comments;
import dao.Receipes;
import dao.Users;
import beans.Comment;
import beans.Receipe;
import beans.User;

public class TestReceipe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int id, String title, String sumup, String desc, String imgRef, Integer nbPers, String cookType, Integer cookExp, Integer duration
		Receipes Dao = new Receipes();
		ArrayList<Receipe> receipes;
		Receipe i = new Receipe(0, "Carpacio de banane", "Bah... C'est un carpacio quoi, mais avec des bananes", "lorem ipsum & co", "cookpony", 6, "Dessert", 2, 20);
		i = Dao.fromRow(Dao.getLast());
		for(int j = 1; j<30; j++) {
			i.setCookexpertise(j%4);
			i.setNbofperson(j%10);
			i.create();
		}
			
		
		System.out.println("-------");
		i = Dao.fromRow(Dao.getLast());
		System.out.println(i);
		System.out.println("#######");
		i.setCooktype("WTF BBQ");
		Dao.update(i);
		i = Dao.fromRow(Dao.getLast());
		System.out.println(i);
		System.out.println("#######");
		
		
		
		receipes = Dao.getReceipes(180, 5, 3, "Salad");		
		Dao.delete(i);
		//users = Dao.getItems();
		//*
		for(Model item : receipes) {
			System.out.println(item);
		}
		//*/
		
	}
	
	

}
