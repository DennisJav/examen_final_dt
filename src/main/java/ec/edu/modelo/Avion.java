package ec.edu.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@Column(name = "avio_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_avion")
	@SequenceGenerator(name = "sec_avion", sequenceName = "sec_avion", allocationSize = 1)
	private Integer id;
	@Column(name = "avio_capacidad_asientos")
	private BigDecimal capacidadAsientos;
	@Column(name = "avio_nombre")
	private String nombreAvion;
	

	//relacion
	@OneToMany(mappedBy = "avion",cascade=CascadeType.ALL) //FECTH CARGA A LOS HIJOS LOS PRECARGA
	private List<Vuelo> vuelo;
	
	
	public List<Vuelo> getVuelo() {
		return vuelo;
	}
	public void setVuelo(List<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}
	
	
	//Metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getCapacidadAsientos() {
		return capacidadAsientos;
	}
	public void setCapacidadAsientos(BigDecimal capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}
	public String getNombreAvion() {
		return nombreAvion;
	}
	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}
	
	
	
	
	
}
