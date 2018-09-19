<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
		
		<div align="center">
			<h3>Contato</h3>
			<form action="ContatoServlet">
					Nome: <input type="text" name="nome" id="nome" /><br/>
					DDD 1: <input type="text" name="dddParam1" id="dddParam1" /><br/>
					Telefone 1: <input type="text" name="telefoneParam1" id="telefoneParam1" /><br/>
					Email 1: <input type="text" name="emailParam1" id="emailParam1" /><br/>
					ID Fornecedor: <input type="text" name="fornecedor_id" id="fornecedor_id" /><br/>
					
					<input type="submit" value="Enviar" />
					
			</form>
		</div>
		
		<div align="center">
			<h3>Fornecedor</h3>
			<form action="FornecedorServlet">
					CNPJ: <input type="text" name="cnpj" id="cnpj" /><br/>
					Nome Fantasia: <input type="text" name="nomeFantasia" id="nomeFantasia" /><br/>
					ID Contato: <input type="text" name="contato_id" id="contato_id" /><br/>
					
					<input type="submit" value="Enviar" />
					
			</form>
		</div>
		
</body>
</html>