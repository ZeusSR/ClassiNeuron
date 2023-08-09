package in.neural.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hyperLink_redirection
 */
@WebServlet("/_redirection")
public class hyperLink_redirection extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
//		PrintWriter out = response.getWriter();
		
//		out.println("<html><head><title>Output</title></head>");
//		out.println("<body align ='center'>");
//		out.println("<ffont color='red'><h2>ICS</h2>");
//		out.println("<h3>ICS currently hosted in below link:</h3></font>");
//		out.println("<h4><a href='http://localhost:8888/ServletCommunictionSendingerrmsgApp/register.html'>Link</a></h4>");
//		out.println("</body>");
//		out.println("</html>");
		
		
		String Location = "http://localhost:8888/ServletCommunictionSendingerrmsgApp/register.html";
		response.sendRedirect(Location);
		
	}

}
