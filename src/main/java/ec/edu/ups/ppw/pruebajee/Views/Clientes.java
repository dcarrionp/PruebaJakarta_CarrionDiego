package ec.edu.ups.ppw.pruebajee.Views;

import java.util.List;

import ec.edu.ups.ppw.pruebajee.Business.GestionClientes;
import ec.edu.ups.ppw.pruebajee.Model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped//Es una solicitud sin estado, se crea a dicrecion y se elimina a discrecion. Tambien hay el SessionScoped y ApplicationScoped
public class Clientes {
	
	@Inject
	private GestionClientes gClientes;
	
	private Cliente cliente = new Cliente();//Se instancia pa que no sea null
	
	private List<Cliente> listado;
	
	@PostConstruct
	public void init() {
		listado = gClientes.getClientes();
	}
	
	public List<Cliente> getListado() {
		return listado;
	}
	public void setListado(List<Cliente> listado) {
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

	public String guardar() {
		System.out.println(this.cliente);
		
		try {
			gClientes.getCliente(cliente.getCedula());
			return "ListadoClientes?faces-redirect=true";
		}catch(Exception e) {
			// TODO auto-generate catch block
			e.printStackTrace();
			return "Error";
		}
		
		//return null;//Se refresca en la misma pagina. 
	}
	
	public String volver() {
		return "Consulta?faces-redirect=true";
	}
}
