package ec.edu.service;

import java.util.List;

import ec.edu.modelo.Vuelo;
import ec.edu.modelo.VueloTO;

public interface IClienteGestor {

	List<VueloTO> paraleloBusqueda(String origen, String destino, String fechaVuelo);
	Vuelo reservarPasajeros(Integer numeroVuelo);
	
}
