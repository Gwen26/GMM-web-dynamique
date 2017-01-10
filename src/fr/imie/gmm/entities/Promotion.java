package fr.imie.gmm.entities;
import java.util.*;


public class Promotion {

  
    
    private Integer id;
    private String name;
    private Integer year;
    
    /**
     * Getters and Setters
     */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
     * Default constructor
     */
    public Promotion(Integer id, String Name, Integer Year) {
    	this.id= id;
    	this.name= name;
    	this.year= year;
    }


}