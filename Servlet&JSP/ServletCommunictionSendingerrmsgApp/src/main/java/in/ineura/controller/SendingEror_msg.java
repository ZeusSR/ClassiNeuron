package in.ineura.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ref")
public class SendingEror_msg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		
		System.out.println("Servlet Loading");
	}

	public SendingEror_msg()
	{
		System.out.println("Servlet instantiation");
	}


	@Override
	public void init() throws ServletException {

		System.out.println("Servlet initialization");
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String umail = request.getParameter("umail");
		String umobile = request.getParameter("umobile");
		Integer uage = Integer.parseInt(request.getParameter("uage"));
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(uage <18 || uage>38)
		{
			response.sendError(502, "Age does not qualify");
		}
		else
		{
			out.println("<html><head><title>Output</title></head>");
			out.println("<body align ='center'>");
			out.println("<ffont color='red'><h2>ICS</h2>");
			out.println("<h3>Registration details</h3></font>");
			out.println("<table border='1' align = 'center'>");
			out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
			out.println("<tr><td>E-Mail</td><td>"+umail+"</td></tr>");
			out.println("<tr><td>Mobile</td><td>"+umobile+"</td></tr>");
			out.println("<tr><td>Age</td><td>"+uage+"</td></tr>");
			out.println("<tr><td>Registration Status</td><td>Success</td></tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
		
		out.close();
	}

	@Override
	public void destroy() {


		System.out.println("Servlet De-instantiation");
	}

}
