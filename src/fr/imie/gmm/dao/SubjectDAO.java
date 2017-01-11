package fr.imie.gmm.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.gmm.entities.Subject;
import fr.imie.gmm.exeptions.DAOException;

@Stateless
public class SubjectDAO {
	
	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	public void create(Subject subject) throws DAOException {
		em.persist(subject);
		
	}
	
	public void delete(Subject subject) throws DAOException {
		em.remove(subject);
	}
	

	public String get (int id) throws DAOException {
		Subject subjects = em.find(Subject.class, id);
		Subject S = new Subject ();
		
		return S.getDescription();
		
	}
	
	public List<Subject> getAll() throws DAOException{
		String query = "SELECT s.title FROM Subject s";
		Query q = (Query) em.createQuery(query);
		
		
		
		return ;
	}
}

