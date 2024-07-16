package ec.edu.ups.ppw.pruebajee.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity 
public class Detalles {
	
	@Column(name="consumos")
	private String nombre;
	@Column(name="deudas")
	private String correo;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	

}
