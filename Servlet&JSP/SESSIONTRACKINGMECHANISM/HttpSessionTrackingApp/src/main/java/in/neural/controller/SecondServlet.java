package in.neural.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Collect Request parameter data
		String qual = request.getParameter("qual");
		String desig = request.getParameter("desig");
		
		//Creating Session Object & store these request object parameters in it
		HttpSession session = request.getSession();
		
		session.setAttribute("qual", qual);
		session.setAttribute("desig", desig);
		
		//forward the response to form3
		request.getRequestDispatcher("./form3.html").forward(request, response);
		
		
	}

}
