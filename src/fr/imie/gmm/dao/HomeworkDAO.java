package fr.imie.gmm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.gmm.entities.Homework;
import fr.imie.gmm.exeptions.DAOException;



public class HomeworkDAO {
	
	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	public void create(Homework homework) throws DAOException {
		em.persist(homework);
		
	}

}
