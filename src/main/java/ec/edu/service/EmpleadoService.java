package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.CompraPasaje;

@Service
public class EmpleadoService implements IEmpleadoGestor{

	@Autowired
	private ICompraPasajeService compraPasajeService;
	
	
	@Override
	public void realizarCheckIn(Integer numeroCompra) {
		// TODO Auto-generated method stub
		CompraPasaje  compra =  this.compraPasajeService.buscarCompraNumero(numeroCompra);
		compra.setEstado("I");
		
	}

	
	
}
