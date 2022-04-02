package ec.edu.repository;

import ec.edu.modelo.CompraPasaje;


public interface ICompraPasajeRepo {
	void insertarCompra(CompraPasaje compraPasaje);
	void actualizarCompra(CompraPasaje compraPasaje);
	CompraPasaje buscarCompra(Integer id);
	void eliminarCompra(Integer id);
	CompraPasaje buscarCompraNumero(Integer numeroCompra);
}
