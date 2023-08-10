package in.neural.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		if(uname.equals("Indra") && upwd.equals("12345"))
		{
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}

}
