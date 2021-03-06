package fr.imie.gmm.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//import Proj_test1.Homework;
//import Proj_test1.Subject;

@Entity
public class Users {

	@Id
	private int userId;
	@Column
	protected String firstname;
	@Column
    protected String lastname;
	@Column
    protected int categoryId;
	@Column
    protected String login;
	@Column
	protected String password;
	private List<Subject>sujets;
	@Column
	protected List<Archive>archives;
	private List<Homework>homeworks;
	
	
//****************************************************************************
	// redef du constructeur
	
	public Users(String firstname, String lastname, int categoryId,
			String login, String password) {
		
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.categoryId = categoryId;
		this.login = login;
		this.password = password;
		
	}
    public Users() {
		
		this.userId =0;
		this.firstname ="";
		this.lastname ="";
		this.categoryId =0;
		this.login ="";
		this.password ="";
	}
    
//****************************************************************************
    //getters & setters
    
    public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Subject> getSujets() {
		return sujets;
	}
	public void setSujets(List<Subject> sujets) {
		this.sujets = sujets;
	}
	public List<Homework> getHomeworks() {
		return homeworks;
	}
	public void setHomeworks(List<Homework> homeworks) {
		this.homeworks = homeworks;
	}
	
}
