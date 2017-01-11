package fr.imie.gmm.entities;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promotion {

  
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(nullable = false, length = 20)
    private String name;
    @Column 
    private Integer year;
    
    /**
     * Getters and Setters
     */
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	  /**
     *  constructor
     */
    public Promotion(int id, String Name, Integer Year) {
    	this.id= id;
    	this.name= name;
    	this.year= year;
    }

    // empty constructor
    
    public Promotion (){
    	
    }
    
}