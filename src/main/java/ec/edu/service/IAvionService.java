package ec.edu.service;

import ec.edu.modelo.Avion;

public interface IAvionService {

	void insertarAvion(Avion avion);
	void actualizarAvion(Avion avion);
	Avion buscarAvion(Integer id);
	void eliminarAvion(Integer id);
	
}
