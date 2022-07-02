<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int Nota1 = Integer.parseInt(request.getParameter("Nota1"));
	int Nota2 = Integer.parseInt(request.getParameter("Nota2"));
	int Nota3 = Integer.parseInt(request.getParameter("Nota3"));

	int media = Nota1 + Nota2 + Nota3 / 3;

	if (media >= 7) {
		out.print("aprovado" + media);
	}

	else {
		out.print("estudar mais");

	}
	%>

</body>
</html>