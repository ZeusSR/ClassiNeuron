package in.neura.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainLaunch
 */
@WebServlet(
		urlPatterns = { "/Main" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "source", value = "java")
		})
public class MainLaunch extends HttpServlet {
	private static final long serialVersionUID = 1L;


	static {
		
		System.out.println("Servlet Loading");
	}
	
	public MainLaunch()
	{
		System.out.println(" Servlet instantiation");
	}

	

	@Override
	public void init() throws ServletException {

		System.out.println(" Servlet Initialization");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

ServletConfig config = getServletConfig();
		
        response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Response output </title></head>");
		out.println("<body >");
		out.println("<table border=1 align='center'>");
		out.println("<tr><th>Parameter Name</th><th>Parameter Value</th></tr>");
		
        Enumeration<String> parameternames = config.getInitParameterNames();
		
		while(parameternames.hasMoreElements())	
		{
			String parametername = (String)parameternames.nextElement();
			String parametervalue = config.getInitParameter(parametername);
			out.println("<tr><td>"+parametername+"</td><td>"+parametervalue+"</td></tr>");
		}
		
		
		
		
		out.println("</table>");
		out.println("</body></html>");
		
		
		out.close();
		
	}
	public void destroy() {

		System.out.println(" Servlet De-Instantiation");
		
	}
}
