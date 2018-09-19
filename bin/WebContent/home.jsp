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
			
			<form action="ContatoServlet">
			
					Nome: <input type="text" name="nome" id="nome" /><br/>
					DDD 1: <input type="text" name="dddParam1" id="dddParam1" /><br/>
					Telefone 1: <input type="text" name="telefoneParam1" id="telefoneParam1" /><br/>
					Email 1: <input type="text" name="emailParam1" id="emailParam1" /><br/>
					
					<input type="submit" value="Enviar" />
					
			</form>
		
		</div>
		
</body>
</html>