package br.com.agenda.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.model.Contato;
import br.com.agenda.model.Fornecedor;
import br.com.agenda.regras.ContatoRN;
import br.com.agenda.regras.FornecedorRN;

@WebServlet("/FornecedorServlet")
public class FornecedorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private FornecedorRN fornecedorService;
	private ContatoRN contatoService;
       
    public FornecedorServlet() {
    	
    	this.fornecedorService = new FornecedorRN();
    	this.contatoService = new ContatoRN();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fornecedor fornecedor = new Fornecedor();
		List<Contato> contatos = new ArrayList<Contato>();
		fornecedor.setCnpj(request.getParameter("cnpj"));
		fornecedor.setNomeFantasia(request.getParameter("nomeFantasia"));
		
		// String idContato = request.getParameter("contato_id");
		Contato contato = contatoService.getById(1L);
		
		contatos.add(contato);
		
		fornecedor.setContatos(contatos);
		
		this.fornecedorService.addFornecedor(fornecedor);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>> CONTATO " + fornecedor.getCnpj() + fornecedor.getNomeFantasia() + "SALVO COM SUCESSO !");
		
	}

}
