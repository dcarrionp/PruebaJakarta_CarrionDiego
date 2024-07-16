package ec.edu.ups.ppw.pruebajee.Business;

import java.util.List;

import ec.edu.ups.ppw.pruebajee.DAO.ClienteDAO;
import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

	@Inject
	private ClienteDAO daoCliente;

	@PostConstruct
	public void init() {

	}

}
