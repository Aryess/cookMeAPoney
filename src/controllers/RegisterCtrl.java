package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import beans.User;
import dao.Users;

@ManagedBean
@RequestScoped

public class RegisterCtrl{
	protected String login;
	protected Boolean err_login;
	protected String pwd;
	protected String pwdConf;
	protected Boolean err_pwd;
	protected String fName;
	protected Boolean err_fName;
	protected String lName;
	protected Boolean err_lName;
	protected int age;
	protected Boolean err_age;
	protected String email;
	protected boolean err_email;
	
	protected Users DAO = new Users();

	public String getLogin() {return this.login;}
	public String getPwd() {return this.pwd;}
	public String getPwdConf() {return this.pwdConf;}
	public String getfName() {return this.fName;}
	public String getlName() {return this.lName;}
	public int getAge() {return this.age;}
	public String getEmail() {return this.email;}
	public Boolean getErr_login() {return this.err_login;}
	public Boolean getErr_pwd() {return this.err_pwd;}	
	public Boolean getErr_fName() {return this.err_fName;}
	public Boolean getErr_lName() {return this.err_lName;}
	public Boolean getErr_age() {return this.err_age;}
	public Boolean getErr_email() {return this.err_email;}
	
	public void setLogin(String login) {this.login = login;}
	public void setPwd(String pwd) {this.pwd = pwd;}
	public void setPwdConf(String pwdConf) {this.pwdConf = pwdConf;}
	public void setfName(String fName) {this.fName = fName;}
	public void setlName(String lName) {this.lName = lName;}
	public void setAge(int age) {this.age = age;}
	public void setEmail(String email) {this.email = email;}
	public void setErr_login(Boolean err_login) {this.err_login = err_login;}
	public void setErr_pwd(Boolean err_pwd) {this.err_pwd = err_pwd;}
	public void setErr_fName(Boolean err_fName) {this.err_fName = err_fName;}
	public void setErr_lName(Boolean err_lName) {this.err_lName = err_lName;}
	public void setErr_age(Boolean err_age) {this.err_age = err_age;}
	public void setErr_email(Boolean err_email) {this.err_email = err_email;}

	public void validateForm() {
		String USERNAME_PATTERN = "^[_A-Za-z0-9-@]+";
		String USERLOGIN_PATTERN = "^[_A-Za-z0-9-@]+";
		String USERMAIL_PATTERN = "[a-zA-Z0-9\\.\\-\\_]+@[a-zA-Z0-9\\.]+\\.[a-zA-Z]+";
		Integer USER_MAX_AGE = 100;
		this.err_lName = false;
		this.err_fName = false;
		this.err_login = false;
		this.err_email = false;
		this.err_age   = false;
		this.err_pwd   = false;
		
		Pattern pattern;
		Matcher matcher;
		
		pattern = Pattern.compile(USERNAME_PATTERN);
		matcher = pattern.matcher(this.lName);
		err_lName = !matcher.matches();
		
		matcher = pattern.matcher(this.fName);
		err_fName = !matcher.matches();
		
		pattern = Pattern.compile(USERLOGIN_PATTERN);
		matcher = pattern.matcher(this.login);
		err_login = !matcher.matches();
		
		pattern = Pattern.compile(USERMAIL_PATTERN);
		matcher = pattern.matcher(this.email);
		err_email = !matcher.matches();
		
		err_age = !(this.age > 0 && this.age < USER_MAX_AGE);
		
		err_pwd = !(this.pwd.equals(this.pwdConf) && !this.pwd.isEmpty());
				
		System.out.println("lName " + err_lName);
		System.out.println("fName " + err_fName);
		System.out.println("login " + err_login);
		System.out.println("email " + err_email);
		System.out.println("age " + err_age);
		System.out.println("pwd " + err_pwd);
		
		if (!(err_lName || err_fName || err_login || err_email || err_age || err_pwd)) {
			// Creer le compte
			this.DAO.create(new User(0, login, pwd, fName, lName, age, email));
		}
	}
	
	
	


}