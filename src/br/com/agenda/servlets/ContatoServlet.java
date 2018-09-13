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
import br.com.agenda.model.Email;
import br.com.agenda.model.Telefone;
import br.com.agenda.regras.ContatoRN;

/**
 * Servlet implementation class ContatoServlet
 */
@WebServlet("/ContatoServlet")
public class ContatoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ContatoRN service;
       
    public ContatoServlet() {
    	
    	this.service = new ContatoRN();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contato contato = new Contato();
		List<Telefone> telefones = new ArrayList<Telefone>();
		List<Email> emails = new ArrayList<Email>();
		
		String nome = request.getParameter("nome");
		contato.setNome(nome);
		
		Email email1 = new Email();
		String emailParam1 = request.getParameter("emailParam1");
		email1.setEmail(emailParam1);
		
		Telefone telefone1 = new Telefone();
		String dddParam1 = request.getParameter("dddParam1");
		String telefoneParam1 = request.getParameter("telefoneParam1");
		
		telefone1.setNumero(telefoneParam1);
		telefone1.setDdd(dddParam1);
		
		email1.setContato(contato);
		telefone1.setContato(contato);
		
		emails.add(email1);
		telefones.add(telefone1);
		
		contato.setEmails(emails);
		contato.setTelefones(telefones);
		
		this.service.addContato(contato);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>> CONTATO " + contato.getNome()+ contato.getEmails() + contato.getTelefones() + "SALVO COM SUCESSO !");
		
	}

}
