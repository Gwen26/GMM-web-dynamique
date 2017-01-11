package fr.imie.gmm.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.gmm.entities.Notification;
import fr.imie.gmm.exeptions.DAOException;

@Stateless
public class NotificationDAO {

	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	public void create(Notification notification) throws DAOException {
		em.persist(notification);
		
	}
	
	public void delete(Notification notification) throws DAOException {
		em.remove(notification);
	}
}
