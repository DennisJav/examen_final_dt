package ec.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Vuelo;
import ec.edu.repository.IVueloRepo;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloRepo vueloRepo;
	
	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepo.insertarVuelo(vuelo);
	}

	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepo.actualizarVuelo(vuelo);
	}

	@Override
	public Vuelo buscarVuelo(Integer id) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVuelo(id);
	}

	@Override
	public void eliminarVuelo(Integer id) {
		// TODO Auto-generated method stub
		this.vueloRepo.eliminarVuelo(id);
	}

	@Override
	public List<Vuelo> buscarVueloEstado(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVueloEstado(origen, destino, fechaVuelo);
	}

	@Override
	public Vuelo buscarVueloNumero(Integer numero) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarVueloNumero(numero);
	}
	
	
	
	
	

}
