<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio de sesion</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
</head>

<body >
	<h1 align="center">Inicio de Sesion</h1>
	<br>
	<form>
		<table border="2" align="center" class="table table-bordered">
			
			<tr align="center"><td><input type="text" name="usuario" class="form-control" placeholder="Usuario"></td></tr>
			<tr align="center"><td><input type="password" name="password" class="form-control" placeholder="Contraseña"></td></tr>
			
		</table>
	</form>
	<div align="center" >
		<a href="RegistroProdctos.jsp"><input type="submit" value="Iniciar Sesion"  class="btn btn-primary"></a>
	</div>
	
</body>
	
</html>