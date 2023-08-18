package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collecting data from request parameter
		String s_name = request.getParameter("s_name");
		String s_id = request.getParameter("s_id");
		String s_class = request.getParameter("s_class");
		String s_age = request.getParameter("s_age");
		

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor='lightgreen' >");
		out.println("<center>");
		out.println("<form method='get' action='./3'> ");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Mail:</td>");
		out.println("<td><input type='text' name='s_mail'/></td>");
		out.println("</tr>");
		out.println("<input type='hidden' name='s_name' value = 's_name'/>");
		out.println("<input type='hidden' name='s_id' value = 's_id'/>");
		out.println("<input type='hidden' name='s_class' value = 's_class'/>");	
		out.println("<input type='hidden' name='s_age' value = 's_age'/>");	
		out.println("<tr>");
		out.println("<td></td><td><input type='submit' value='Next'/></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form> ");
		out.println("</center>");
	}

}
