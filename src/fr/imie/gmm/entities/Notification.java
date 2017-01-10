package fr.imie.gmm.entities;
import java.util.*;

/**
 * 
 */
public class Notification {

    private Integer id;
    private String Message;
    private String titleMessage;
    
    
    /**
     *Getters and Setters
     */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
    public Notification(Integer id, String message, String titleMessage) {
    	this.id= id;
    	this.Message= message;
    	this.titleMessage= titleMessage;
    }
	
}