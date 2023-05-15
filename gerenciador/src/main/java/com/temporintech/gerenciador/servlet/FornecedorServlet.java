package com.temporintech.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class Fornecedor
@WebServlet("/fornecedor")
public class FornecedorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo fornecedor");
		
		//Recebe parametros da requisão  
		String nomeFornecedor = request.getParameter("nome");
		String dataAbertura = request.getParameter("data");
		
		Date data = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome_fornecedor(nomeFornecedor);
		fornecedor.setDataAbertura(data);
		
		Banco banco = new Banco();
		banco.adiciona(fornecedor);
		
		request.setAttribute("empresa", fornecedor.getNome_fornecedor());
		
		response.sendRedirect("listaEmpresas");
		
	}

}
