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
int valor = Integer.parseInt(request.getParameter("valor"));

int par = valor%2;

if ( par == 0) {
	out.print("numero par");
}

else {
	out.print("numero impar");

}
%>




%>

</body>
</html>