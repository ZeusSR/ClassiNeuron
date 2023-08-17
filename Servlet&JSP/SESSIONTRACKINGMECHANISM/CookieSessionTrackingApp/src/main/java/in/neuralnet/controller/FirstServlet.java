package in.neuralnet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collect data from request parameter
		String prod_id = request.getParameter("prod_id");
		String prod_name = request.getParameter("prod_name");
		
		//Creating cookie to store data
		Cookie c1 = new Cookie("prod_id",prod_id);
		Cookie c2 = new Cookie("prod_name",prod_name);
		
		//Sending cookie through Response object
		response.addCookie(c1);
		response.addCookie(c2);
		
		//Forward request
		request.getRequestDispatcher("/Second.html").forward(request, response);
		
		
	}

}
