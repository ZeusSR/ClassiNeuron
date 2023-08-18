package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collecting data from request parameter
		String s_name = request.getParameter("s_name");
		String s_id = request.getParameter("s_id");
		String s_class = request.getParameter("s_class");
		String s_age = request.getParameter("s_age");
		String s_mail = request.getParameter("s_mail");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<body bgcolor='lightgreen'>");
		out.println("<center>");
		out.println("<table bgcolor='green' border='3'");
		out.println("<tr><th>Name :</th><td>"+s_name+"</td></tr>");
		out.println("<tr><th>ID :</th><td>"+s_id+"</td></tr>");
		out.println("<tr><th>Class :</th><td>"+s_class+"</td></tr>");
		out.println("<tr><th>Age :</th><td>"+s_age+"</td></tr>");
		out.println("<tr><th>Mail :</th><td>"+s_mail+"</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
	}

}
