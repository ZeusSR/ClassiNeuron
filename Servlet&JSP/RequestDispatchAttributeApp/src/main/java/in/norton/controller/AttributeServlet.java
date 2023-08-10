package in.norton.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AttributeServlet")
public class AttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("Server", "Ubuntu");
		request.setAttribute("Technology", "SpringBoot");
		request.setAttribute("Framework", "NextJs");
		
		request.getRequestDispatcher("/test").forward(request, response);
		
	}

}
