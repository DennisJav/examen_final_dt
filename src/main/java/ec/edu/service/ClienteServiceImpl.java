package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Cliente;
import ec.edu.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertarCliente(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizarCliente(cliente);
	}

	@Override
	public Cliente buscarCliente(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarCliente(id);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.eliminarCliente(id);
		
	}
	
	
}
