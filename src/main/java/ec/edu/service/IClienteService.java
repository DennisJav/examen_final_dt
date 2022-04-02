package ec.edu.service;

import ec.edu.modelo.Cliente;


public interface IClienteService {
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	Cliente buscarCliente(Integer id);
	void eliminarCliente(Integer id);
}
