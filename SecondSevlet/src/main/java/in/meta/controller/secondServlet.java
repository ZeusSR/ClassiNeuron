package in.meta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class seconServlet
 */
@WebServlet("/meta")
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static
	{
		System.out.println("Servlet Loading");
	}
	
	public secondServlet()
	{
		System.out.println("Servlet Instantiation");
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.Setting the response type
		response.setContentType("text/html");
		
		//2. Getting Printwritter object to send the response
		PrintWriter out = response.getWriter();
		
		//3.Setting the html page to write the response
		out.println("<htm><title><head>Output</head></title> <body>Processing GET request......</body></htm>");
	
		//4.Closing the writer object
		out.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Setting the response type
		response.setContentType("text/html");
		
		//2. Getting Printwritter object to send the response
		PrintWriter out = response.getWriter();
		
		//3.Setting the html page to write the response
		out.println("<htm><title><head>Output</head></title> <body>Processing POST request......</body></htm>");
	
		//4.Closing the writer object
		out.close();
	}

}
