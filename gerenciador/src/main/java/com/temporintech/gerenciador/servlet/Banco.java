package com.temporintech.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Banco {
	
	private static List<Fornecedor> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(chaveSequencial++);
		fornecedor.setNome_fornecedor("TemporinTech");
		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.setId(chaveSequencial++);
		fornecedor2.setNome_fornecedor("Alura");
		lista.add(fornecedor);
		lista.add(fornecedor2);
	}

	public void adiciona(Fornecedor fornecedor) {
		fornecedor.setId(Banco.chaveSequencial++);
		 lista.add(fornecedor);
	}
	
	public List<Fornecedor> getFornecedor(){
		return Banco.lista;
	}

	public void removeFornecedor(Integer id) {
 
			Iterator<Fornecedor> it = lista.iterator();
			
			while(it.hasNext()) {
				Fornecedor fornecedor = it.next();
				
				if(fornecedor.getId() == id) {
					it.remove();
				}
			}
			
		}

	public Fornecedor buscaFornecedorID(Integer id) {
		for (Fornecedor fornecedor : lista) {
			if(fornecedor.getId() == id) {
				return fornecedor;
			}
		}
		return null;
	}

}
