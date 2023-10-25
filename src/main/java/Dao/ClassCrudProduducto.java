package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;
import model.TblProductocl2;

public class ClassCrudProduducto implements IProductoable{

	@Override
	public void RegistrarProducto(TblProductocl2 tblpro) {
	//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_CORTARREALDELACRUZLEONARDO");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		entitymanag.getTransaction().begin();
		//registramos datos...
		entitymanag.persist(tblpro);
		//confirmamos 
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();	
	}


	@Override
	public List<TblProductocl2> ListadoProducto() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_CORTARREALDELACRUZLEONARDO");
		//manejador de entidades segun unidad de persistencia...
		EntityManager entitymanag=conex.createEntityManager();
		//realizamos el proceso...
		//iniciar transaccion...
		entitymanag.getTransaction().begin();
		
		List<TblProductocl2> listado=entitymanag.createQuery("select e from TblProductocl2 e",TblProductocl2.class).getResultList();
		//confirmamos
		entitymanag.getTransaction().commit();
		//cerramos
		entitymanag.close();
		//retornamos el listado
        return listado;
	}

}
