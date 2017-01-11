package fr.imie.gmm.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.gmm.entities.Group;
import fr.imie.gmm.entities.Promotion;
import fr.imie.gmm.exeptions.DAOException;

@Stateless
public class GroupDAO {

	@PersistenceContext(unitName = "imiejpa_PU")
	private EntityManager em;

	public void create(Group group) throws DAOException {
		em.persist(group);

	}

	public void delete(Group group) throws DAOException {
		em.remove(group);
	}

	public Group get(int id) throws DAOException {
		Group group = em.find(Group.class, id);
		return group;
	}
}