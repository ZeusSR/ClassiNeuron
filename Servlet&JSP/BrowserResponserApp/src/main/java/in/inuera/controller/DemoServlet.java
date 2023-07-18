package in.inuera.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet(urlPatterns={"/Demo"},loadOnStartup = 1)
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static
	{
		System.out.println("Demo Servlet Loading");
	}
	public DemoServlet()
	{
		System.out.println("Demo Servlet Instantiation");
	}
	
	
	@Override
	public void init() throws ServletException {

		System.out.println("Demo Servlet Initialization");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Request Processing of GET request type");
		
		System.out.println("Client IP address is :"+request.getRemoteAddr());
		System.out.println("Client Host is :"+request.getRemoteHost());
		System.out.println("Client Port is :"+request.getRemotePort());
		System.out.println("Server name is :"+request.getServerName());
		System.out.println("Server Port is :"+request.getServerPort());
	}

	@Override
	public void destroy() {

		System.out.println("Demo De-instantiation");
	}
}
