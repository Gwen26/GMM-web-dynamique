package fr.imie.gmm.entities;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCompleted;



@Entity
public class Subject {

  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column (nullable=false, length = 200)
    private String title;
	@Column (nullable = false)
    private Date createAt;
	@Column (nullable = false)
    private DateTimeAtCompleted deadline;
	@Column(nullable = false)
    private String description;
	@Column(nullable = true)
    private int groupSize;
	@Column (nullable = false)
	private Teacher createBy;
	@Column
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


	
	public DateTimeAtCompleted getDeadline() {
		return deadline;
	}

	public void setDeadline(DateTimeAtCompleted deadline) {
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

	public Subject(String title, Date createAt, DateTimeAtCompleted deadline, String description,String promotion, String teacher) {
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

       
   public void createSubject (int groupSize, DateTimeAtCompleted deadline){
   	this.groupSize = groupSize;
   	this.deadline = deadline;
   }
   
   public void delete(){}







	
    
    
}
	