package fr.imie.gmm.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.gmm.entities.Promotion;
import fr.imie.gmm.exeptions.DAOException;

@Stateless
public class PromotionDAO {

	
	@PersistenceContext(unitName="imiejpa_PU")
	private EntityManager em;
	
	public void create(Promotion promotion) throws DAOException {
		em.persist(promotion);
		
	}
	
	public void delete(Promotion promotion) throws DAOException {
		em.remove(promotion);
	}
	
	public Promotion get (int id) throws DAOException {
		Promotion promotion = em.find(Promotion.class, id);
		return null;
	}
	
}
