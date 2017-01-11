package fr.imie.gmm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrator extends Users{
	
	@Id
	private int adminId;
	private Teacher teach=null;
    private Student student=null;
    private Users user=null;
    
//***************************************************************************
    //constructor
    
    public Administrator(String firstname,String lastname,String login,String password) {
    	super (firstname, lastname,3, login, password);
    }
    
    public Administrator(){
    	
    }
    
    
//***************************************************************************
	// getters & setters
    
    public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public Teacher getTeach() {
		return teach;
	}
	public void setTeach(Teacher teach) {
		this.teach = teach;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
//****************************************************************************

}
