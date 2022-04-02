package ec.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.modelo.CompraPasaje;


@Repository
@Transactional
public class CompraPasajeImpl implements ICompraPasajeRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCompra(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compraPasaje);
	}

	@Override
	public void actualizarCompra(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compraPasaje);
	}

	@Override
	public CompraPasaje buscarCompra(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CompraPasaje.class, id);
	}

	@Override
	public void eliminarCompra(Integer id) {
		// TODO Auto-generated method stub
		CompraPasaje c=this.buscarCompra(id);
		this.entityManager.remove(c);
	}

	@Override
	public CompraPasaje buscarCompraNumero(Integer numeroCompra) {
		// TODO Auto-generated method stub
		TypedQuery<CompraPasaje> miTypedQuery = this.entityManager
				.createQuery("select v from Vuelo v where v.numeroCompra = :valor",CompraPasaje.class);
		miTypedQuery.setParameter("valor", numeroCompra);
		
		return miTypedQuery.getSingleResult();
	}

	
}
