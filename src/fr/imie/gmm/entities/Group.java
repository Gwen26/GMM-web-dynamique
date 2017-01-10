package fr.imie.gmm.entities;

public class Group {

  

    // Attributs de la Classe
    
    private Integer id;
    private String group_name;
    
    /**
     * Getters and Setters
     */
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	
	/**
	 * Constructeur
	 */
	public Group(Integer id, String Group_name){
		this.id= id;
		this.group_name = group_name;
	}
   
    // Fonctions de la Classe Group
    
    public void create() {
        // TODO implement here
    }

    public void modify() {
        // TODO implement here
    }

	

}