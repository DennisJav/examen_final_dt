package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.CompraPasaje;
import ec.edu.repository.ICompraPasajeRepo;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService{

	@Autowired
	private ICompraPasajeRepo compraPasajeRepo;

	@Override
	public void insertarCompra(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.insertarCompra(compraPasaje);
	}

	@Override
	public void actualizarCompra(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.actualizarCompra(compraPasaje);
	}

	@Override
	public CompraPasaje buscarCompra(Integer id) {
		// TODO Auto-generated method stub
		return this.compraPasajeRepo.buscarCompra(id);
	}

	@Override
	public void eliminarCompra(Integer id) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.eliminarCompra(id);
	}

	@Override
	public CompraPasaje buscarCompraNumero(Integer numeroCompra) {
		// TODO Auto-generated method stub
		return this.compraPasajeRepo.buscarCompraNumero(numeroCompra);
	}
	
	
}
