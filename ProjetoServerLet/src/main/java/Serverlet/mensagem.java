package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mensagem extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServerException, IOException {

		
		PrintWriter etr = resp.getWriter();
		
		etr.println("<html>");
		etr.println("<head>");
		etr.println("<title>Primeira Servlet</title>");
		etr.println("</head>");
		etr.println("<body>");
		etr.println("<h1>Utilizando serverlets na Apex!</h1>");
		etr.println("</body>");
		etr.println("</html>");
	}

}
