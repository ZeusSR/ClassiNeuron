package in.neuralnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.neuralnet.beans.Student;
import in.neuralnet.factory.StudentServicefactory;
import in.neuralnet.service.IStudentService;


@WebServlet("/controller/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String requestURI = request.getRequestURI();
		 System.out.println(requestURI);
		  RequestDispatcher rd = null;
		  
		  IStudentService studentservice = StudentServicefactory.getStudentService();
		  
		
		if(requestURI.endsWith("layout"))
		{
			rd = request.getRequestDispatcher("../Layout.html");
			rd.forward(request, response);
		}
		if(requestURI.endsWith("AddForm"))
		{
			String ssport = request.getParameter("ssport");
			String sage = request.getParameter("sage");
			String sname = request.getParameter("sname");
			String saddr = request.getParameter("saddr");
			
			Student student = new Student();
			student.setSsport(ssport);
			student.setSage(Integer.parseInt(sage));
			student.setSname(sname);
			student.setSaddr(saddr);
			
			String status = studentservice.save(student);
			System.out.println(status);
			
			if(status.equalsIgnoreCase("success"))
			{
				rd = request.getRequestDispatcher("../success.html");
				rd.forward(request, response);
			}
			else
			if(status.equalsIgnoreCase("failure"))
			{
				rd = request.getRequestDispatcher("../failure.html");
				rd.forward(request, response);
			}
			else
			{
				rd = request.getRequestDispatcher("../exception.html");
				rd.forward(request, response);
			}
			
		}
		if(requestURI.endsWith("SearchForm"))
		{
			int sid = Integer.parseInt(request.getParameter("sid"));
			
			Student student = new Student();
			
			student.setSid(sid);
			
			student = studentservice.findById(sid);
			
			if(student != null)
			{
				Integer stid = student.getSid();
				String ssports = student.getSsport();
				Integer sage = student.getSage();
				String sname = student.getSname();
				String saddress = student.getSaddr();
				response.setContentType("text/html");
				
				PrintWriter out = response.getWriter();
				
				out.println("<html><title>Response</title></head><body bgcolor=\"lightgreen\">");
				out.println("<table border=1 align='center'>");
				out.println("<tr>");
				out.println("<th>SID :</th><td>"+stid+"</td>");
				out.println("<tr/>");
				out.println("<tr>");
				out.println("<th>SPORT :</th><td>"+ssports+"</td>");
				out.println("<tr/>");
				out.println("<tr>");
				out.println("<th>NAME :</th><td>"+sname+"</td>");
				out.println("<tr/>");
				out.println("<tr>");
				out.println("<th/>AGE :</th><td>"+sage+"</td>");
				out.println("<tr/>");
				out.println("<tr>");
				out.println("<th>ADDRESS :</th><td>"+saddress+"</td>");
				out.println("<tr/>");
				out.println("</table>");
				out.println("</body></html>");
				
				
				
			}
			else
			{
				rd = request.getRequestDispatcher("../notfound.html");
				rd.forward(request, response);
			}
		}	
		
		if(requestURI.endsWith("DeleteForm"))
		{
			int sid = Integer.parseInt(request.getParameter("sid"));
			
			Student student = new Student();
			
			student.setSid(sid);
			
			String status = studentservice.deleteById(sid);
			if(status.equalsIgnoreCase("success"))
			{
				rd = request.getRequestDispatcher("../success.html");
				rd.forward(request, response);
			}
			else
			if(status.equalsIgnoreCase("failure"))
			{
				rd = request.getRequestDispatcher("../notfound.html");
				rd.forward(request, response);
			}
			else
			{
				rd = request.getRequestDispatcher("../exception.html");
				rd.forward(request, response);
			}
		}
		if(requestURI.endsWith("EditForm"))
		{
			String sid = request.getParameter("sid");
			Student student = studentservice.findById(Integer.parseInt(sid));
			if (student != null) {
				response.setContentType("text/html");

				// display editpage using html
				PrintWriter out = response.getWriter();
				out.println("<html><head><title>OUTPUT</title></head>");
				out.println("<body bgcolor='sandybrown'>");
				out.println("<br/><br/><br/>");
				out.println("<form method='post' action='./update'>");
				out.println("<table align='center'>");
				out.println("<tr><th>ID</th><td>" + student.getSid() + "</td></tr>");
				out.println("<input type='hidden' name='sid' value='" + student.getSid() + "'/>");
				out.println("<tr><th>NAME</th><td><input type='text' name='sname' value='" + student.getSname()
						+ "'/></td></tr>");
				out.println("<tr><th>AGE</th><td><input type='text' name='sage' value='" + student.getSage()
						+ "'/></td></tr>");
				out.println("<tr><th>ADDRESS</th><td><input type='text' name='saddr' value='" + student.getSaddr()
						+ "'/></td></tr>");
				out.println("<tr><td></td><td><input type='submit' value='update'/></td></tr>");
				out.println("</table>");
				out.println("</form>");
				out.println("</body>");
				out.println("</html>");
				out.close();

				
				
				
			}
			else
			{
				rd = request.getRequestDispatcher("../notfound.html");
				rd.forward(request, response);
			}
		
			
	
		}
		if (requestURI.endsWith("update")) {

			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			String sage = request.getParameter("sage");
			String saddr = request.getParameter("saddr");

			Student student = new Student();
			student.setSid(Integer.parseInt(sid));
			student.setSname(sname);
			student.setSage(Integer.parseInt(sage));
			student.setSaddr(saddr);
			
			String status = studentservice.updateById(student);
			if (status.equals("success")) {
				rd = request.getRequestDispatcher("../success.html");
				rd.forward(request, response);
			} else if (status.equals("failure")) {
				rd = request.getRequestDispatcher("../failure.html");
				rd.forward(request, response);
			} 

		}
	}
}
