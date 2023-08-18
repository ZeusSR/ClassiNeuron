package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collecting data from request parameter
				String accn_type = request.getParameter("accn_type");
				String accn_brch = request.getParameter("accn_brch");
				
				//Creating Session Object
				HttpSession session = request.getSession();
				session.setAttribute("accn_type", accn_type);
				session.setAttribute("accn_brch", accn_brch);
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<body bgcolor='lightgreen'>");
				out.println("<center>");
				out.println("<form method='get' action='"+response.encodeURL("./3")+"'>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<td>Depositor Name :</td>");
				out.println("<td><input type='text' name='depo_name'/></td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>Deposited Amount :</td>");
				out.println("<td><input type='text' name='depo_amnt'/></td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td><input type='submit' value='Register'/></td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</form> ");
				out.println("</center>");
				out.println("</body>");
				
				out.close();

	}

}
