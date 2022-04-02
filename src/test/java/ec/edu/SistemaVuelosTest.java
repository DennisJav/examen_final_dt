package ec.edu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.modelo.Avion;
import ec.edu.modelo.Cliente;
import ec.edu.modelo.Vuelo;
import ec.edu.service.IAvionService;
import ec.edu.service.IClienteService;
import ec.edu.service.ICompraPasajeService;
import ec.edu.service.IVueloService;

@SpringBootTest
public class SistemaVuelosTest {

	@Autowired
	private IAvionService avionService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVueloService vueloService;
	@Autowired
	private ICompraPasajeService compraPasajeService;
	
	
	@Test
	public void insertarAvion() {
		Avion a = new Avion();
		a.setNombreAvion("Tame");
		a.setCapacidadAsientos(new BigDecimal(50));
		a.setId(1);
		
		//this.avionService.insertarAvion(a);
		//Avion avion = this.avionService.buscarAvion(1);
		//assertEquals(1, avion.getId());
		

	}
	
	@Test
	public void insertarCliente() {
		Cliente cliente = new Cliente();
		
		cliente.setNombreCliente("Dennis");
		cliente.setId(1);
		
//		this.clienteService.insertarCliente(cliente);
//		
//		Cliente clienteb = this.clienteService.buscarCliente(1);
//		assertEquals(1, clienteb.getId());
		
	}
	
	
	@Test
	public void insertarVuelo() {
		Vuelo vue=new Vuelo();
		
		vue.setNumeroVuelo(123);
		vue.setAsientosDisponibles(new BigDecimal(150));
		vue.setCategoria("E");
		vue.setDestino("Madrid");
		vue.setEstado("D");
		vue.setValorAsiento(new BigDecimal(700));
		vue.setOrigen("Quito");
		vue.setFechaVuelo("21/05/2022");
		
		Vuelo vu = this.vueloService.buscarVuelo(1);
		
		//this.vueloService.insertarVuelo(vue);
		//assertEquals(1, vu.getId());
		
		Vuelo vue2=new Vuelo();
		
		vue2.setNumeroVuelo(123);
		vue2.setAsientosDisponibles(new BigDecimal(150));
		vue2.setCategoria("N");
		vue2.setDestino("Madrid");
		vue2.setEstado("ND");
		vue2.setValorAsiento(new BigDecimal(700));
		vue2.setOrigen("Quito");
		vue2.setFechaVuelo("21/05/2022");
		
		//this.vueloService.insertarVuelo(vue2);
		
		Vuelo vue3=new Vuelo();
		
		vue3.setNumeroVuelo(123);
		vue3.setAsientosDisponibles(new BigDecimal(150));
		vue3.setCategoria("T");
		vue3.setDestino("Barcelona");
		vue3.setEstado("D");
		vue3.setValorAsiento(new BigDecimal(700));
		vue3.setOrigen("Caracas");
		vue3.setFechaVuelo("21/05/2022");
		
		//this.vueloService.insertarVuelo(vue3);
		
		
		
		
		
		
	}
	
	
	
}
