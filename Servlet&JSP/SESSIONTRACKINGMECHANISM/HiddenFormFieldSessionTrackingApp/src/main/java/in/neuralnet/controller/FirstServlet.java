package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collecting data from request parameter
				String s_name = request.getParameter("s_name");
				String s_id = request.getParameter("s_id");
				String s_class = request.getParameter("s_class");
				

				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<body bgcolor='lightorange' >");
				out.println("<center>");
				out.println("<form method='get' action='./2'> ");
				out.println("<table>");
				out.println("<tr>");
				out.println("<td>Age :</td>");
				out.println("<td><input type='text' name='s_age'/></td>");
				out.println("</tr>");
				out.println("<input type='hidden' name='s_name' value = 's_name'/>");
				out.println("<input type='hidden' name='s_id' value = 's_id'/>");
				out.println("<input type='hidden' name='s_class' value = 's_class'/>");				
				out.println("<tr>");
				out.println("<td></td><td><input type='submit' value='Next'/></td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</form> ");
				out.println("</center>");

				out.println("</body>");
				
				out.close();
		
	}

}
