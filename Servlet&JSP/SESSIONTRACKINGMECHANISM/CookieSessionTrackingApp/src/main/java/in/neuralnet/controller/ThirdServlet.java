package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collect data from request parameter
		String prodmfg_date = request.getParameter("prodmfg_date");
		String prodexp_date = request.getParameter("prodexp_date");
		
		
		Cookie cookies[] = request.getCookies();
		String prod_id = cookies[0].getValue();
		String prod_name = cookies[1].getValue();
		String prod_cost = cookies[2].getValue();
		String prod_quant = cookies[3].getValue();
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor='darkblue'>");
		out.println("<table align='center' bgcolor='lightblue' border='2'>");
		out.println("<tr><th>Product ID:</th><td>"+prod_id+"</td></tr>");
		out.println("<tr><th>Prouct Name:</th><td>"+prod_name+"</td></tr>");
		out.println("<tr><th>Product Cost:</th><td>"+prod_cost+"</td></tr>");
		out.println("<tr><th>Product Quantity:</th><td>"+prod_quant+"</td></tr>");
		out.println("<tr><th>MFG Date:</th><td>"+prodmfg_date+"</td></tr>");
		out.println("<tr><th>EXP Date:</th><td>"+prodexp_date+"</td></tr>");
		out.println("</table>");
		out.println("</body>");
		
	}

}
