package com.temporintech.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet")
public class HelloWorld extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<Body>");
		out.print("Parabéns HelloWorlds seu primeiro servlet!");
		out.print("</Body>");
		out.print("</html>");
		
		System.out.println("O servlet HelloWord foi chamado");
	}

}
