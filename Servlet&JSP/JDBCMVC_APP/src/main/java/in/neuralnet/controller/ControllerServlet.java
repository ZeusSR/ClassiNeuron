package in.neuralnet.controller;

import java.io.IOException;

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
			
			
		}
		
	}
}
