<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
	
		<form action="ServletCompra" method="post">
		
			Email: <input type="text" name="email"> <br/>
			
			Producto
			<select name="producto">
				<option value="camisa">Camisa</option>
				<option value="pantalon">Pantalon</option>
				<option value="calcetines">Calcetines</option>
			</select> <br/>
			
			Unidades: <input type="text" name="unidades"/> <br/>
			
			<input type="submit" value="Comprar">
		
		</form>
		
		<hr/>
		
		<a href="socios.jsp">Socios</a>
	
	</div>

</body>
</html>