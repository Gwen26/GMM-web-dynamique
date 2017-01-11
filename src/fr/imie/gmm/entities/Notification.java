package fr.imie.gmm.entities;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Notification {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column (nullable = false, length = 300)
    private String Message;
	@Column (nullable =  false, length = 50)
    private String titleMessage;
    
    
    /**
     *Getters and Setters
     */
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getTitleMessage() {
		return titleMessage;
	}
	public void setTitleMessage(String titleMessage) {
		this.titleMessage = titleMessage;
	}

	   /**
     * constructor
     */
    public Notification(int id, String message, String titleMessage) {
    	this.id= id;
    	this.Message= message;
    	this.titleMessage= titleMessage;
    }
    
    //Empty constructor
    public Notification(){
    	
    }
	
}