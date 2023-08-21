package in.neuralnet.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/1")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String word = request.getParameter("word");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    out.println("<h2>The word is : "+word+"</h2>");
	}

}
