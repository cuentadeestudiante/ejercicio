<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="compra" scope="request" class="modelo.Compra"></jsp:useBean>

	<div align="center">
	
		Email:  <jsp:getProperty property="email" name="compra"/><br/>
		Producto: <jsp:getProperty property="producto" name="compra"/><br/>
		Unidades: <jsp:getProperty property="unidades" name="compra"/>
		<br/><br/>
		TOTAL: <jsp:getProperty property="total" name="compra"/>
	
	</div>

</body>
</html>