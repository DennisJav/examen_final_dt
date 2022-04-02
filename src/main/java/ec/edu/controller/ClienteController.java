package ec.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.modelo.Vuelo;
import ec.edu.service.IClienteGestor;
import ec.edu.service.IClienteService;
import ec.edu.service.ICompraPasajeService;
import ec.edu.service.IEmpleadoGestor;
import ec.edu.service.IVueloService;

@Controller
@RequestMapping("/clientes/")
public class ClienteController {

	@Autowired
	private IClienteGestor clienteGestor;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVueloService vueloService;
	@Autowired
	private ICompraPasajeService compraPasajeService;
	@Autowired
	private IEmpleadoGestor empleadoGestor;
	
	
	@GetMapping("buscar/vueloparametros/")
	public String ObtenerPaginaIngresoCliente(Vuelo vuelo, Model modelo) {
		return "clienteNuevo";
	}
}
