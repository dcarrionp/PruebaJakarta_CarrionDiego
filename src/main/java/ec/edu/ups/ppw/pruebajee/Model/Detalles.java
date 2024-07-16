package ec.edu.ups.ppw.pruebajee.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Detalles {
	
	@Id
	@GeneratedValue
	@Column(name="codigo")
	private int codigo;
	@Column(name="consumos")
	private String consumos;
	@Column(name="deudas")
	private double deudas;
	
	@ManyToOne
	@JoinColumn(name="cli_cedula")
	private Cliente cli;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getConsumos() {
		return consumos;
	}
	public void setConsumos(String consumos) {
		this.consumos = consumos;
	}
	public double getDeudas() {
		return deudas;
	}
	public void setDeudas(double deudas) {
		this.deudas = deudas;
	}
	
	
	

}
