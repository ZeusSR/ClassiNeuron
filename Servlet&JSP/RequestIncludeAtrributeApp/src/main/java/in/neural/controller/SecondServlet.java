package in.neural.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		System.out.println("Request Object address: "+request.hashCode());
		System.out.println("Response Object address: "+response.hashCode());
		System.out.println("Printwriter Object address: "+out.hashCode());
		
		Enumeration<String> attributenames = request.getAttributeNames();
		
		
//		out.println("<h4 style='color:darkorange; text-align:center'>Include Request Attribute</h4>");
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>Name</th><th>Value</th></tr>");
		while(attributenames.hasMoreElements())
		{
			out.println("<tr>");
			String name = attributenames.nextElement();
			Object value = request.getAttribute(name);
			out.println("<td>"+name+"</td>");
			out.println("<td>"+value+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

}
