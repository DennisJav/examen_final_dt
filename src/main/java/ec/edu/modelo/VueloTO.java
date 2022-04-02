package ec.edu.modelo;

import java.math.BigDecimal;

public class VueloTO {

	
	private Integer numeroVuelo;
	private BigDecimal valorAsiento;
	private String origen;
	private String destino;
	private String categoria;
	private String nombreAvion;

	
	
	
	public VueloTO() {
		super();
	}

	public VueloTO(Integer numeroVuelo, BigDecimal valorAsiento, String origen, String destino,
			String categoria, String nombreAvion) {
		super();
		this.numeroVuelo = numeroVuelo;
		this.valorAsiento = valorAsiento;
		this.origen = origen;
		this.destino = destino;
		this.categoria = categoria;
		this.nombreAvion = nombreAvion;
	}

	public Integer getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(Integer numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public BigDecimal getValorAsientoIndividual() {
		return valorAsiento;
	}

	public void setValorAsientoIndividual(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombreAvion() {
		return nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}
	
	
	
	
	
}
