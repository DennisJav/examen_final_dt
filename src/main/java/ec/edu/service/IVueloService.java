package ec.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.modelo.Vuelo;

public interface IVueloService {

	void insertarVuelo(Vuelo vuelo);
	void actualizarVuelo(Vuelo vuelo);
	Vuelo buscarVuelo(Integer id);
	void eliminarVuelo(Integer id);
	List<Vuelo> buscarVueloEstado(String origen, String Destino, LocalDateTime fechaVuelo);
	Vuelo buscarVueloNumero(Integer numero);
}
