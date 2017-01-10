package fr.imie.gmm.entities;
import java.util.*;


public class Subject {

  
    
    private int id;
    private String title;
    private Date createAt;
    private Date deadline;
    private String description;
    private int groupSize;
    private Teacher createBy;
    private List <Promotion> promotion;
    
    
    /**
     * Getter and Setters
     */
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	
	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}


	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public int getGroupSize() {
		return groupSize;
	}

	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}



	public Teacher getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Teacher createBy) {
		this.createBy = createBy;
	}



	public List<Promotion> getPromotion() {
		return promotion;
	}

	public void setPromotion(List<Promotion> promotion) {
		this.promotion = promotion;
	}
    
    
    

	/**
	 * Constructeur
	 */

	public Subject(String title, Date createAt, Date deadline, String description,String promotion, String teacher) {
			this.title= title;
			this.createAt = createAt;
			this.deadline = deadline;
			this.description = description;
			this.promotion = new ArrayList<Promotion>();
			this.createBy = new Teacher ();
	}

	
	
    /**
     * Méthodes de la classe
     */
    public void consult() {
        
    }

        
    public void createSubject (int groupSize, Date deadline){
    	this.groupSize = groupSize;
    	this.deadline = deadline;
    }
    
    public void delete(){}







	
    
    
}
	