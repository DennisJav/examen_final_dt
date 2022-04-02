package ec.edu.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "compra_pasaje")
public class CompraPasaje {

	@Id
	@Column(name = "copa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_compra")
	@SequenceGenerator(name = "sec_compra", sequenceName = "sec_compra", allocationSize = 1)
	private Integer id;
	@Column(name = "copa_numero")
	private Integer numeroCompra;
	@Column(name = "copa_fecha_compra")
	private LocalDateTime fechaCompra;
	@Column(name = "copa_numero_tarjeta")
	private String numeroTarjeta;
	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer cantidadAsientos;
	@Column(name = "copa_estado")
	private String estado;
	
	
	//relacion
	@ManyToOne
	@JoinColumn(name = "vuel_id")
	private Vuelo vuelo;
	
	@ManyToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;
	
	
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	//Metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroCompra() {
		return numeroCompra;
	}
	public void setNumeroCompra(Integer numeroCompra) {
		this.numeroCompra = numeroCompra;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public Integer getCantidadAsientos() {
		return cantidadAsientos;
	}
	public void setCantidadAsientos(Integer cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
