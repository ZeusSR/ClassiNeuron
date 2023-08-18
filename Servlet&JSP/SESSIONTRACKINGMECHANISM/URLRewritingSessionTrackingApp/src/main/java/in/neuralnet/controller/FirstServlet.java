package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collecting data from request parameter
		String accn_no = request.getParameter("accn_no");
		String accn_name = request.getParameter("accn_name");
		
		//Creating Session Object
		HttpSession session = request.getSession();
		session.setAttribute("accn_no", accn_no);
		session.setAttribute("accn_name", accn_name);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor='lightgreen' >");
		out.println("<center>");
		out.println("<form method='get' action='"+response.encodeURL("./2")+"'> ");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Account type :</td>");
		out.println("<td><input type='text' name='accn_type'/></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Account Branch :</td>");
		out.println("<td><input type='text' name='accn_brch'/></td>");
		out.println("</tr>");
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
