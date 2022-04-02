package ec.edu.service;

import ec.edu.modelo.CompraPasaje;


public interface ICompraPasajeService {
	void insertarCompra(CompraPasaje compraPasaje);
	void actualizarCompra(CompraPasaje compraPasaje);
	CompraPasaje buscarCompra(Integer id);
	void eliminarCompra(Integer id);
	CompraPasaje buscarCompraNumero(Integer numeroCompra);
	
}
