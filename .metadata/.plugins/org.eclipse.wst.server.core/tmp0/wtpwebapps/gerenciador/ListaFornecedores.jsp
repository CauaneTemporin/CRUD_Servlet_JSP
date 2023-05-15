	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<%@ page import= "java.util.List, com.temporintech.gerenciador.servlet.Fornecedor"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	<c:url value="/mostrarFornecedor" var="linkMostrarFornecedor"/>
	<c:url value="/removeFornecedor" var="linkRemoveForncedor"/>
	
	<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>Lista de Fornecedores</title>
		</head>
		
		<body>
		
				<c:if test="${not empty empresa}">
					Fornecedor ${ empresa } cadastrado com sucesso!!!
				</c:if>
				</br></br>
			Lista de Fornecedores: </br>
		
			 <ul>
	        <c:forEach items="${fornecedores}" var="fornecedor">
				<li>${fornecedor.nome_fornecedor} - <fmt:formatDate value="${fornecedor.dataAbertura}" pattern="dd/MM/yyyy"/> 
				<a href="${linkMostrarFornecedor}?id=${fornecedor.id}">Editar</a>
				<a href="${linkRemoveForncedor}?id=${fornecedor.id}">Remover</a>
				</li>
	        </c:forEach>
	    </ul>
	    
	    </body>
	</html>