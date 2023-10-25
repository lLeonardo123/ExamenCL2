package TestEntidades;

import java.util.List;

import Dao.ClassCrudProduducto;
import model.TblProductocl2;;

public class TestProducto {

	public static void main(String[] args) {
		
		//realizamos las respectivas instancias...
		TblProductocl2 tblpro=new TblProductocl2();	
		ClassCrudProduducto crud=new ClassCrudProduducto();
		
		/*METODO REGISTRAR PRODUCTO*/
		
		tblpro.setNombrecl2("Arroz");
		tblpro.setPrecioventacl2(2.5);
		tblpro.setPreciocompcl2(2.7);
		tblpro.setEstadocl2("Vigente");
		tblpro.setDescripcl2("Oferta");
		//invocamos al metodo registrar..
		crud.RegistrarProducto(tblpro);
		//emitimos un mensaje por consola..
		System.out.println("Dato registrado en BD");
		
		
		
		
		
		/*LISTAR PRODUCTOS*/
		/*
		List<TblProductocl2> listar=crud.ListadoProducto();
		//aplicamos un bucle...
		for(TblProductocl2 lis:listar){
			
			//imprimimos por pantalla
			System.out.println("Codigo "+lis.getIdproductocl2()+" nombre "+lis.getNombrecl2()+" precio venta "
			+lis.getPrecioventacl2()+" precio compra "+lis.getPreciocompcl2()+" estado "+lis.getEstadocl2()+
			" descripcion "+lis.getDescripcl2());
			
		}    
		*/
	}   //fin del metodo pr
}    //fin de la clase testempleado.....
