package ec.edu.repository;

import ec.edu.modelo.Cliente;


public interface IClienteRepo {
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	Cliente buscarCliente(Integer id);
	void eliminarCliente(Integer id);
}
