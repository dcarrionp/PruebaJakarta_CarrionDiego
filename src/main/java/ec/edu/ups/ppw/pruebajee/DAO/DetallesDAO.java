package ec.edu.ups.ppw.pruebajee.DAO;

import java.util.List;

import ec.edu.ups.ppw.pruebajee.Model.Detalles;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class DetallesDAO {
	
	@PersistenceContext
	private EntityManager em;

	public void insert(Detalles detalle_factura) {
		em.persist(detalle_factura);
	}
	
	public void update(Detalles detalle_factura) {
		em.merge(detalle_factura);
	}
	public void delete(int codigo) {
		Detalles detalle_factura = this.read(codigo);
		em.remove(detalle_factura);
	}
	
	public Detalles read(int codigo) {
		Detalles detalle_factura = em.find(Detalles.class, codigo);
		return detalle_factura;
	}
	
	public List<Detalles> getAll() {
		String jpl = "SELECT d FROM Detalle_Factura d";
		Query query = em.createQuery(jpl, Detalles.class);
		return query.getResultList();
	}

}
