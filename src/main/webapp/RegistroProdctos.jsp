<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="model.TblProductocl2" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">

</head>
<body>
<h1 align="center">
Registrar Producto
</h1>
<form action="ControladorServlet" method="post">
	<table align="center">
		
		<tr>
			<td>Nombre</td>
			<td><input type="text" name="nombre" class="form-control"></td>
		</tr>
		
		<tr>
			<td>Precio Venta</td>
			<td><input type="text" name="precioventa" class="form-control"></td>
		</tr>
		
		<tr>
			<td>Precio Compra</td>
			<td><input type="text" name="preciocompra" class="form-control"></td>
		</tr>
		
		<tr>
			<td>Estado</td>
			<td><input type="text" name="estado" class="form-control"></td>
		</tr>
		
		<tr>
			<td>Descripcion</td>
			<td><input type="text" name="descripcion" class="form-control"></td>
		</tr>
		
		<td colspan="2" align="center">
		<input type="submit" value="Registrar Producto"  class="btn btn-primary">
		</td>
	</table>
</form>

<h1 align="center">Listado de Productos</h1>
<table align="center" border="2">
	<tr>
		<th>Nombre</th>
		<th>Precio Venta</th>
		<th>Precio Compra</th>
		<th>Estado</th>
		<th>Descripcion</th>
	</tr>

	<% 
	List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listado");
	if(ListadoProducto!=null){
		for(TblProductocl2 lis:ListadoProducto){
	%>
	<tr>
		<td>
			<%= lis.getNombrecl2() %>
		</td>
		
		<td>
			<%= lis.getPrecioventacl2()%>
		</td>
		
		<td>
			<%= lis.getPreciocompcl2() %>
		</td>
		
		<td>
			<%= lis.getEstadocl2() %>
		</td>
		
		<td>
			<%= lis.getDescripcl2() %>
		</td>
	</tr>
<% 
	}
}
%>

</table>
</body>
</html>