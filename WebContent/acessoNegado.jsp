<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Usu�rio n�o possui acesso � aplica��o.</h3>
	
	<label>Usu�rio:</label>
	<%
		out.println(request.getAttribute("usuarioNaoAutenticado"));
	%>
	<p/>
	
	<a href="login">Tentar novamente.</a>

</body>
</html>