package in.neural.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Collect Request parameter data
		String mail = request.getParameter("mail");
		String mobile = request.getParameter("mobile");
		
		//Creating Session Object & store these request object parameters in it
		HttpSession session = request.getSession();
		
		session.setAttribute("mail", mail);
		session.setAttribute("mobile", mobile);
		
		
		//Send all the data i.e collected in session object to client in tabular form
		PrintWriter out = response.getWriter();
		
//		Enumeration<String> attributenames = session.getAttributeNames();
//		
//		out.println("<table border='1' align='center'>");
//		out.println("<tr><th>Name</th><th>Value</th></tr>");
//		while(attributenames.hasMoreElements())
//		{
//			out.println("<tr>");
//			String name = attributenames.nextElement();
//			Object value = request.getAttribute(name);
//			out.println("<td>"+name+"</td>");
//			out.println("<td>"+value+"</td>");
//			out.println("</tr>");
//			
//		}
//		out.println("</table>");
		
		Object name = session.getAttribute("name");
		Object age = session.getAttribute("age");
		Object qual = session.getAttribute("qual");
		Object desig = session.getAttribute("desig");
		Object mailid = session.getAttribute("mail");
		Object mobileno = session.getAttribute("mobile");
		
		out.println("<body bgcolor='lightpink'>");
		out.println("<table border='1' align='center' bgcolor='lightgrey'>");
		out.println("<tr><td>Name</td><td>"+name+"</td></tr>");
		out.println("<tr><td>Age</td><td>"+age+"</td></tr>");
		out.println("<tr><td>Qualification</td><td>"+qual+"</td></tr>");
		out.println("<tr><td>Designation</td><td>"+desig+"</td></tr>");
		out.println("<tr><td>Mail-ID</td><td>"+mailid+"</td></tr>");
		out.println("<tr><td>Mobile</td><td>"+mobileno+"</td></tr>");
		out.println("</table>");
		out.println("<body>");
	}

}
