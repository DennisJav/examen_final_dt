package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Avion;
import ec.edu.repository.IAvionRepo;

@Service
public class AvionServiceImpl implements IAvionService{

	@Autowired
	private IAvionRepo avionRepo;
	
	@Override
	public void insertarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.insertarAvion(avion);
	}

	@Override
	public void actualizarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.actualizarAvion(avion);
	}

	@Override
	public Avion buscarAvion(Integer id) {
		// TODO Auto-generated method stub
		return this.avionRepo.buscarAvion(id);
	}

	@Override
	public void eliminarAvion(Integer id) {
		// TODO Auto-generated method stub
		this.avionRepo.eliminarAvion(id);
	}
	
	

}
