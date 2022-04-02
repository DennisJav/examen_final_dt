package ec.edu.repository;

import ec.edu.modelo.Avion;

public interface IAvionRepo {

	void insertarAvion(Avion avion);
	void actualizarAvion(Avion avion);
	Avion buscarAvion(Integer id);
	void eliminarAvion(Integer id);
	
}
