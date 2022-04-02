package ec.edu.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Vuelo;
import ec.edu.modelo.VueloTO;

@Service
public class ClienteGestor implements IClienteGestor{

	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVueloService vueloService;
	


	
	
	@Override
	public Vuelo reservarPasajeros(Integer numeroVuelo) {
		// TODO Auto-generated method stub
		Vuelo vuelo =null;
		try {
			vuelo = this.vueloService.buscarVueloNumero(numeroVuelo);
			String disponible = vuelo.getEstado();
			if(disponible == "D") {
				return vuelo;
				//vuelo.geta
			}
		}catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vuelo;

			
		
	}





	@Override
	public List<VueloTO> paraleloBusqueda(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		
		List<Vuelo> vuelos = this.vueloService.buscarVueloEstado(origen, destino, fechaVuelo);
		Stream<Vuelo> vuel2 =  vuelos.parallelStream().filter(v->v.getEstado().equals("D"));
		
		Stream<VueloTO> lista=vuel2.parallel().map(v -> {
			VueloTO vueloTO = new VueloTO();
			vueloTO.setNumeroVuelo(v.getNumeroVuelo());
			
			
		});
		
		
		
		return null;
	}

}
