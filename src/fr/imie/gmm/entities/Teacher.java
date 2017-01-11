package fr.imie.gmm.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;


public class Teacher extends Users {
	
	@Id
	private int teacherId;
	@Column
	private List<Subject> sujets;
	@Column
	private List<Homework> homeworks;
	@Column
	private List<Integer>promotion;
	
	
//******************************************************************************************************************
    // constructor
	
	public Teacher() {
		
	}
	public Teacher(String firstname,String lastname,int categoryId,String login,String password) {
    	super(firstname, lastname, 1, login, password);
    }
    
    
//*****************************************************************************************************************
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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
	public List<Integer> getPromotion() {
		return promotion;
	}
	public void setPromotion(List<Integer> promotion) {
		this.promotion = promotion;
	}
	
//*****************************************************************************************************************	

}
