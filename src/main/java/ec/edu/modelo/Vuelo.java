package ec.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@Column(name = "vuel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_vuelo")
	@SequenceGenerator(name = "sec_vuelo", sequenceName = "sec_vuelo", allocationSize = 1)
	private Integer id;
	@Column(name = "vuel_numero")
	private Integer numeroVuelo;
	@Column(name = "vuel_fecha_vuelo")
	private String fechaVuelo;
	@Column(name = "vuel_asientos_disponibles")
	private BigDecimal asientosDisponibles;
	@Column(name = "vuel_asientos_ocupados")
	private BigDecimal asientosOcupados;
	@Column(name = "vuel_origen")
	private String origen;
	@Column(name = "vuel_destino")
	private String destino;
	@Column(name = "vuel_valor_asiento")
	private BigDecimal valorAsiento;
	@Column(name = "vuel_estado")
	private String estado;
	@Column(name = "vuel_categoria")
	private String categoria;
	
	

	
	//relacion
	@ManyToOne
	@JoinColumn(name = "avio_id")
	private Avion avion;
	
	@OneToMany(mappedBy = "vuelo",cascade=CascadeType.ALL) 
	private List<CompraPasaje> compraPajase;		
	
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public List<CompraPasaje> getCompraPajase() {
		return compraPajase;
	}
	public void setCompraPajase(List<CompraPasaje> compraPajase) {
		this.compraPajase = compraPajase;
	}
	
	
	//metodos set y get
	
	
	public String getCategoria() {
		return categoria;
	}
	public BigDecimal getAsientosOcupados() {
		return asientosOcupados;
	}
	public void setAsientosOcupados(BigDecimal asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	} 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(Integer numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public BigDecimal getAsientosDisponibles() {
		return asientosDisponibles;
	}
	public void setAsientosDisponibles(BigDecimal asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
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
	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}
	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
