package ec.edu.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.Vuelo;


@Repository
@Transactional
public class VueloRepoImpl implements IVueloRepo{

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	public Vuelo buscarVuelo(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public void eliminarVuelo(Integer id) {
		// TODO Auto-generated method stub
		Vuelo v=this.buscarVuelo(id);
		this.entityManager.remove(v);
	}

	@Override
	public List<Vuelo> buscarVueloEstado(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> miTypedQuery = this.entityManager
				.createQuery("select v from Vuelo v where v.origen = :valoruno AND v.destino = :valordos AND v.fechaVuelo = :valortres",Vuelo.class);
		miTypedQuery.setParameter("valoruno", origen);
		miTypedQuery.setParameter("valordos", destino);
		miTypedQuery.setParameter("valortres", fechaVuelo);

		List<Vuelo> listaDetalles = miTypedQuery.getResultList();
		
		return listaDetalles;
	}

	@Override
	public Vuelo buscarVueloNumero(Integer numero) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> miTypedQuery = this.entityManager
				.createQuery("select v from Vuelo v where v.numeroVuelo = :valor",Vuelo.class);
		miTypedQuery.setParameter("valor", numero);
		
		return miTypedQuery.getSingleResult();
	}

}
