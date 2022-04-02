package ec.edu.modelo;

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
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "clie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_cliente")
	@SequenceGenerator(name = "sec_cliente", sequenceName = "sec_cliente", allocationSize = 1)
	private Integer id;
	@Column(name = "clie_nombre")
	private String nombreCliente;
	
	//relacion
	@OneToMany(mappedBy = "cliente",cascade=CascadeType.ALL) //FECTH CARGA A LOS HIJOS LOS PRECARGA
	private List<Vuelo> vuelo;
	
	
	public List<Vuelo> getVuelo() {
		return vuelo;
	}
	public void setVuelo(List<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}
	
	//metodos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	
	

}
