package ec.edu.ups.ppw.pruebajee.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Detalles {
	
	@Id
	@GeneratedValue
	@Column(name="codigo")
	private int codigo;
	@Column(name="consumos")
	private String consumos;
	@Column(name="deudas")
	private String deudas;
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
	public String getDeudas() {
		return deudas;
	}
	public void setDeudas(String deudas) {
		this.deudas = deudas;
	}
	
	
	

}
