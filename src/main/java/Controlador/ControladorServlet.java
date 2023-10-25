package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudProduducto;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorServlet
 */
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/RegistroProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String nombre=request.getParameter("nombre");
		Double precioventa=Double.parseDouble(request.getParameter("precioventa"));
		Double preciocompra=Double.parseDouble(request.getParameter("preciocompra"));
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
		//Instanciamos las respectivas clases
		TblProductocl2 tblproducto=new TblProductocl2();
		ClassCrudProduducto crud=new ClassCrudProduducto();
		//Asignamos los respectivos valores
		tblproducto.setNombrecl2(nombre);
		tblproducto.setPrecioventacl2(precioventa);
		tblproducto.setPreciocompcl2(preciocompra);
		tblproducto.setEstadocl2(estado);
		tblproducto.setDescripcl2(descripcion);
		//Invocamos el metodo registrar
		crud.RegistrarProducto(tblproducto);
		//Recuperamos el listado de autos
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		//Enviamos a la vista
		request.setAttribute("listado", listadoproducto);
		//Redireccionamos
		request.getRequestDispatcher("/RegistroProdctos.jsp").forward(request, response);		
		
		
	}

}
