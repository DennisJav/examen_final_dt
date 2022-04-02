package ec.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Vuelo;

@Service
public class ClienteGestor implements IClienteGestor{

	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVueloService vueloService;
	
	@Override
	public List<Vuelo> paraleloBusqueda(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public void reservarPasajeros(Integer numeroVuelo) {
		// TODO Auto-generated method stub
		Vuelo vuelo = this.vueloService.buscarVueloNumero(numeroVuelo);
		String disponible = vuelo.getEstado();
		if(disponible == "D") {
			vuelo.getAsientosDisponibles();
			//vuelo.geta
		}
		
	}

}
