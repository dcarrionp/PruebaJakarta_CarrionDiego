package ec.edu.ups.ppw.pruebajee.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="TBL_CLIENTE")
public class Cliente {
	
	@Id
	@Column(name="cli_cedula")
	private String cedula;
	@Column(name="cli_nombre")
	private String nombre;
	@Column(name="cli_correo")
	private String correo;
	@Column(name="cli_telefono")
	private String telefono;
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ "]";
	}

}
