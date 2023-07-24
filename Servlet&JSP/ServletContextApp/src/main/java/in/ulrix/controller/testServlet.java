package in.ulrix.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testServlet
 */
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static
	{
		System.out.println("test loading");
		
	}
	
	public testServlet()
	{
		System.out.println("test instantiation");
		
	}
	

	@Override
	public void init() throws ServletException {

		System.out.println("test initialization");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     ServletContext context = getServletContext();
		context.setAttribute("Name", "Indra");
		context.setAttribute("Likes", "Airavat");
		context.setAttribute("Weapon", "Vajra");
		context.setAttribute("Palace", "Swarga");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Response output </title></head>");
		out.println("<body >");
		out.println("<table border=1 align='center'>");
		out.println("<tr><th>Parameter Name</th><th>Parameter Value</th></tr>");
		Enumeration<String> parameternames = context.getInitParameterNames();
		while(parameternames.hasMoreElements())	
		{
			String parametername = (String)parameternames.nextElement();
			String parametervalue = context.getInitParameter(parametername);
			out.println("<tr><td>"+parametername+"</td><td>"+parametervalue+"</td></tr>");
		}
		out.println("<tr><th>Attribute Name</th><th>Attribute Value</th></tr>");
		
		//Attribute data which is dynamic
		Enumeration<String> attributenames = context.getAttributeNames();
		while(attributenames.hasMoreElements())
		{
			String attributename = (String)attributenames.nextElement();
			Object  attributeValue = context.getAttribute(attributename);
			out.println("<tr><td>"+attributename+"</td><td>"+attributeValue+"</td></tr>");
		}
		
		
		out.println("</table>");
		out.println("</body></html>");
		
		
		out.close();
	}
	@Override
	public void destroy() {

		System.out.println("test De-instantiation");
	}

}
