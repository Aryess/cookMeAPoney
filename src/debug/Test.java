package debug;

import interfaces.Model;

import java.util.ArrayList;

import dao.Users;
import beans.User;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//(id, login, pwd, fName, lName, age, email, false)
		Users uDao = new Users();
		ArrayList<Model> users;
		User u = new User(42, "aaaaaaaarLogin", "aPwd", "aName", "aForname", 24, "awesome@mail.adress");
		
		//uDao.create(u);
		u.setEmail("r@gmail.com");
		uDao.create(u);
	
		//u = uDao.getItem(3);
		System.out.println("Login titi:toto");
		u = uDao.getUser("titi", "toto");
		System.out.println(u);
		
		System.out.println("Login jdoe:toto");
		u = uDao.getUser("jdoe", "toto");
		System.out.println(u);
		
		System.out.println("Login jdoe:jdoe");
		u = uDao.getUser("jdoe", "jdoe");
		System.out.println(u);
		
		
		//uDao.update(u);
		
		//uDao.delete(2);
		//users = uDao.getItems();
		/*
		for(Model user : users) {
			System.out.println(user);
		}
		//*/
		
	}

}
