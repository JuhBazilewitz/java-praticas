<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Usuário não possui acesso à aplicação.</h3>
	
	<label>Usuário:</label>
	<%
		out.println(request.getAttribute("usuarioNaoAutenticado"));
	%>
	<p/>
	
	<a href="login">Tentar novamente.</a>
	<p/>
	
	<%
	ArrayList<String> motivos = (ArrayList<String>) request.getAttribute("motivos");
	%>
	
	Informe o motivo:
	<select name="motivo-erro-acesso">
		<option value="">Selecione...</option>
		<%
		for(int i = 0; i < motivos.size(); i++){
		    out.println("<option value=\"" + i + "\">" + motivos.get(i) + "</option>");
		}
		%>
	</select>

</body>
</html>