package ec.edu.ups.ppw.pruebajee.DAO;

import java.util.List;


import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Cliente read(String cedula) {
		Cliente cliente = em.find(Cliente.class, cedula);
		return cliente;
	}
	
	public List<Cliente> getAll() {
		String jpl = "SELECT c FROM Cliente c";
		Query query = em.createQuery(jpl, Cliente.class);
		return query.getResultList();
	}

}
