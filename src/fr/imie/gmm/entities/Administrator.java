package fr.imie.gmm.entities;

import javax.persistence.Entity;
<<<<<<< HEAD
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
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;

	
	///// Initialize getters and setters. /////
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	
	
	
>>>>>>> 762784b032beedd48cf15bab6989c2e5551befb1

}
