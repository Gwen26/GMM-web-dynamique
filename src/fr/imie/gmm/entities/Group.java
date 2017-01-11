package fr.imie.gmm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group {

  

    // Attributs de la Classe
    
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
	@Column(nullable= false, length=35)
    private String groupName;
    
    /**
     * Getters and Setters
     */
    public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup_name() {
		return groupName;
	}

	public void setGroup_name(String group_name) {
		this.groupName = group_name;
	}
	
	/**
	 * Constructeur
	 */
	public Group(int id, String Group_name){
		this.id= id;
		this.groupName = groupName;
	}
	
	//Empty constructor
	public Group (){
		
	}
   
    // Fonctions de la Classe Group
    
    public void create() {
        // TODO implement here
    }

    public void modify() {
        // TODO implement here
    }

	

}