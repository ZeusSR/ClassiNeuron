package in.neural.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = {"/reg"}, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false"), 
				@WebInitParam(name = "user", value = "krushandevu1"), 
				@WebInitParam(name = "password", value = "Krush@k$0987")
		})
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	private Connection connection = null;
	
	static
	{
		System.out.println("register servlet loading");
	}
	
	public registerServlet()
	{
		System.out.println("register servlet instantiation");
		
	}
	
	@Override
	public void init() throws ServletException {


		System.out.println("register servlet initialization");
		
		
		ServletConfig config = getServletConfig();
		
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.Get the data from request object
		String username = request.getParameter("username");
		String usermail = request.getParameter("usermail");
		String usercity = request.getParameter("usercity");
		String state = request.getParameter("userstate");
		
		String sqlstatement = "Insert into temp_student(vch_name,vch_email,vch_city,vch_state) values(?,?,?,?);";
		PreparedStatement pstmt = null;
		int rowcount =0;
		
		//2.Use JDBC API code to store data in DB
		if(connection != null)
		{
			try {
				 pstmt = connection.prepareStatement(sqlstatement);
				 if(pstmt != null)
				 {
					 pstmt.setString(1, username);
					 pstmt.setString(2, usermail);
					 pstmt.setString(3, usercity);
					 pstmt.setString(4, state);
					 
					  rowcount = pstmt.executeUpdate();
				 }
				 
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//3.Prepare a response and provide it to the end user
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<title>output</title>");
		
		if(rowcount == 1)
		{
			out.println("<h1 style ='color:green; text-align:center'>Successful Registration</h1>");
			out.println("<a href='./register.html> Register Again</a>");
		}
		else
		{
			out.println("<h1 style ='color:red; text-align:center'>Un-successful Registration</h1>");
			out.println("<a  href='./register.html' > Register Again</a>");
		}
		
		out.println("</html>");
		
		out.close();
		
		
	}

	@Override
	public void destroy() {

		System.out.println("register servlet de-instantiation");
	}
}
