package ec.edu.ups.ppw.pruebajee.Business;

import ec.edu.ups.ppw.pruebajee.DAO.ClienteDAO;
import ec.edu.ups.ppw.pruebajee.DAO.DetallesDAO;
import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import ec.edu.ups.ppw.pruebajee.Model.Detalles;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

	@Inject
	private ClienteDAO daoCliente;

	@Inject
	private DetallesDAO daoDet;

	@PostConstruct
	public void init() {
		System.out.println("Hola mundo EJB");

		Cliente cliente = new Cliente();
		cliente.setCedula("0106824667");
		cliente.setNombre("Diego Carrion");
		cliente.setCorreo("dcarrionp@est.ups.edu.ec");
		cliente.setTelefono("0968727418");

		daoCliente.insert(cliente);

		cliente = new Cliente();
		cliente.setCedula("0106824668");
		cliente.setNombre("Diego");
		cliente.setCorreo("dcarrionp@est.ups.edu.ec");
		cliente.setTelefono("0968727418");

		daoCliente.insert(cliente);

		Cliente listado = daoCliente.getByCedula(cliente.getCedula());

		Detalles detalle = new Detalles();

		detalle.setConsumos("15 kV");
		detalle.setDeudas(5.67);
		daoDet.insert(detalle);

		detalle.setConsumos("15 kV");
		detalle.setDeudas(5.67);
		daoDet.insert(detalle);

	}

}
