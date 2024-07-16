package ec.edu.ups.ppw.pruebajee.Business;

import java.util.List;

import ec.edu.ups.ppw.pruebajee.DAO.ClienteDAO;
import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionClientes {
	@Inject
	private ClienteDAO daoCliente;

	public Cliente getCliente(String cedula) throws Exception {
		if (cedula.length() != 10) {
			throw new Exception("Cedula incorrecta");
		}

		Cliente cliente = daoCliente.read(cedula);
		if (cliente == null)
			throw new Exception("Cliente no existe");
		return cliente;
	}

	public List<Cliente> getClientes() {
		return daoCliente.getAll();
	}

}
