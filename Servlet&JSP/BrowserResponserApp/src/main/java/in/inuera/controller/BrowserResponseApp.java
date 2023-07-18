package in.inuera.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BrowserResponseApp
 */
@WebServlet(urlPatterns ={"/webale"},loadOnStartup = 10)
public class BrowserResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;


	static
	{
		System.out.println("webale Servlet Loading");
	}
	public BrowserResponseApp()
	{
		System.out.println("webale Servlet Instantiation");
	}
	
	
	@Override
	public void init() throws ServletException {

		System.out.println("webale Servlet Initialization");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Request Processing for GET type");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Enumeration<String> headernames = request.getHeaderNames();
		
		out.println("<html>");
		out.println("<head><title>Browser Response</title></head>");
		out.println("<body>");
		out.println("<table border='1' align='center'>");
		out.println("<th bgcolor='blue'>Headername</th><th bgcolor='blue'>Headervalue</th>");
		
		while(headernames.hasMoreElements())
		{
			out.println("<tr>");
			 String headername = (String)headernames.nextElement();
			 out.println("<td>"+headername+"</td>");
			 String headervalue = request.getHeader(headername);
			 out.println("<td>"+headervalue+"</td>");
			 out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}


	@Override
	public void destroy() {

		System.out.println("webale De-instantiation");
	}

}
