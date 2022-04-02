package ec.edu.service;

import java.util.List;


import ec.edu.modelo.Vuelo;

public interface IClienteGestor {

	List<Vuelo> paraleloBusqueda(String categoria);
	void reservarPasajeros(Integer numeroVuelo);
	
}
