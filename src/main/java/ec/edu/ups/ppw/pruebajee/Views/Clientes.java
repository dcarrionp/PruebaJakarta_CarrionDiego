package ec.edu.ups.ppw.pruebajee.Views;

import java.util.List;

import ec.edu.ups.ppw.pruebajee.Business.GestionClientes;
import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped // Es una solicitud sin estado, se crea a dicrecion y se elimina a discrecion.
				// Tambien hay el SessionScoped y ApplicationScoped
public class Clientes {
	
	@EJB
    private GestionClientes gClientes;

	private Cliente cliente = new Cliente();// Se instancia pa que no sea null

	private Cliente listado;

	private String cedulaBusqueda;

	@PostConstruct
	public void init() {
		listado = gClientes.getClientePorCedula(null);
	}

	public Cliente getListado() {
		return listado;
	}

	public void setListado(Cliente listado) {
		this.listado = listado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public GestionClientes getgClientes() {
		return gClientes;
	}

	public void setgClientes(GestionClientes gClientes) {
		this.gClientes = gClientes;
	}

	public String getCedulaBusqueda() {
		return cedulaBusqueda;
	}

	public void setCedulaBusqueda(String cedulaBusqueda) {
		this.cedulaBusqueda = cedulaBusqueda;
	}

	public String Consultar() {
		try {
			Cliente clienteEncontrado = gClientes.getCliente(cedulaBusqueda);
			if (clienteEncontrado != null) {
				this.cliente = clienteEncontrado;
				return "ListadoClientes?faces-redirect=true";
			} else {
				// Manejo del caso en que no se encuentre el cliente
				return "Error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	public String volver() {
		return "Consulta?faces-redirect=true";
	}
}
