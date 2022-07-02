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

int tabuada = Integer.parseInt(request.getParameter("tabuada"));
int limitador = Integer.parseInt(request.getParameter("limitador"));

String calculo = "";

for (int i = 1; i<= limitador; i++){ // laço de repetição da tabuada
    calculo = tabuada + " x " + i + " = " + (tabuada*i);
	out.print(calculo);
	out.print("<br>"); // quebra linha

}


%>

</body>
</html>