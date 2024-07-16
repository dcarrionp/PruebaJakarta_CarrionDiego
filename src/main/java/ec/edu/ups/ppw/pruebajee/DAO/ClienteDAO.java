package ec.edu.ups.ppw.pruebajee.DAO;

import java.util.List;


import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager em;

	public void insert(Cliente cliente) {
		em.persist(cliente);
	}
	
	public void update(Cliente cliente) {
		em.merge(cliente);
	}
	public void delete(String cedula) {
		Cliente cliente = this.read(cedula);
		if(cliente!=null) {
			em.remove(cliente);
		}
	}
	
	public Cliente read(String cedula) {
		Cliente cliente = em.find(Cliente.class, cedula);
		return cliente;
	}
	
	public Cliente getByCedula(String cedula) {
	    String jpql = "SELECT c FROM Cliente c WHERE c.cedula = :cedula";
	    Query query = em.createQuery(jpql, Cliente.class);
	    query.setParameter("cedula", cedula);
	    try {
	        return (Cliente) query.getSingleResult();
	    } catch (NoResultException e) {
	        return null; // o lanza una excepción o maneja el caso de no encontrar resultados según tu lógica
	    }
	}

}
