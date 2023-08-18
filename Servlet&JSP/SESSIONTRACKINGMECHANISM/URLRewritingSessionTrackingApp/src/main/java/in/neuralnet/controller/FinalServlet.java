package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/3")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Collecting data from request parameter
		String depo_name = request.getParameter("depo_name");
		String depo_amnt = request.getParameter("depo_amnt");
		
		
		HttpSession session = request.getSession();
		
		Object accn_no = session.getAttribute("accn_no");
		Object accn_name = session.getAttribute("accn_name");
		Object accn_type = session.getAttribute("accn_type");
		Object accn_brch = session.getAttribute("accn_brch");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<body bgcolor='lightgreen'>");
		out.println("<center>");
		out.println("<table bgcolor='green' border='3'");
		out.println("<tr><th>Account Number :</th><td>"+accn_no+"</td></tr>");
		out.println("<tr><th>Account Name :</th><td>"+accn_name+"</td></tr>");
		out.println("<tr><th>Account type :</th><td>"+accn_type+"</td></tr>");
		out.println("<tr><th>Account Branch :</th><td>"+accn_brch+"</td></tr>");
		out.println("<tr><th>Depositor Name :</th><td>"+depo_name+"</td></tr>");
		out.println("<tr><th>Deposited Amount :</th><td>"+depo_amnt+"</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
	}

}
