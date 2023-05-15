<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraFornecedor" var="linkAlteraFornecedor"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Alterando dados</title>
	</head>
	
	<body>
		<form action="${linkAlteraFornecedor }" method="post">
			Nome: <input type="text" name="nome" value ="${ fornecedor.nome_fornecedor }"/>
			Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${fornecedor.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
				
			<input type="hidden" name="id" value ="${ fornecedor.id }" />
			<input type="submit" />
		</form>
	</body>
</html>