package in.neuralnet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collect data from request parameter
		String prod_cost = request.getParameter("prod_cost");
		String prod_quant = request.getParameter("prod_quant");
		
		//Creating cookie to store data
		Cookie c3 = new Cookie("prod_cost",prod_cost);
		Cookie c4 = new Cookie("prod_quant",prod_quant);
		
		//Sending cookie through Response object
		response.addCookie(c3);
		response.addCookie(c4);
		
		//Forward request
		request.getRequestDispatcher("/third.html").forward(request, response);
	}

}
