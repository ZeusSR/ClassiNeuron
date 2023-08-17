package in.neural.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collect Request parameter data
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//Creating Session Object & store these request object parameters in it
		HttpSession session = request.getSession();
		
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		
		//forward the response to form2
		request.getRequestDispatcher("./form2.html").forward(request, response);
		
		
	}

}
