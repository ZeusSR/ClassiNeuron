package in.neural.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();
		
		
		
		System.out.println("Request Object address: "+request.hashCode());
		System.out.println("Response Object address: "+response.hashCode());
		System.out.println("Printwriter Object address: "+out.hashCode());
		
		
		request.setAttribute("SpringBoot", "Microservices");
		request.setAttribute("React", "NextJs");
		request.setAttribute("Python", "ML");
		
		request.getRequestDispatcher("/test2").include(request, response);
		
		
		out.close();
	}

}
