package fr.imie.gmm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.gmm.entities.Subject;
import fr.imie.gmm.exeptions.DAOException;


public class SubjectDAO {
	
	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	public void create(Subject subject) throws DAOException {
		em.persist(subject);
		
	}
	
	public void delete(Subject subject) throws DAOException {
		em.remove(subject);
	}
	
	

}
