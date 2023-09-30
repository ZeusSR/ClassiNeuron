package in.neuralnet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.neuralnet.beans.Users;
import in.neuralnet.factory.UserServicefactory;
import in.neuralnet.service.IUserService;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doprocess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doprocess(request, response);
	}

	private void doprocess(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		 
		
		
		 String action = request.getServletPath();

	        try {
	            switch (action) {
	                case "/new":
	                    showNewForm(request, response);
	                    break;
	                case "/insert":
	                    insertUser(request, response);
	                    break;
	                case "/delete":
	                    deleteUser(request, response);
	                    break;
	                case "/edit":
	                    showEditForm(request, response);
	                    break;
	                case "/update":
	                    updateUser(request, response);
	                    break;
	                default:
	                    listUser(request, response);
	                    break;
	            }
	        } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }


	    public void showNewForm(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
	        dispatcher.forward(request, response);
	    }



	    public void insertUser(HttpServletRequest request, HttpServletResponse response)
	    throws  IOException {
	    	
	    	
	        String sname = request.getParameter("sname");
	        String semail = request.getParameter("semail");
	        String scountry = request.getParameter("scountry");
	        String ssports = request.getParameter("ssports");
	        
	        Users newUser = new Users();
	        
	        newUser.setSname(sname);
	        newUser.setSemail(semail);
	        newUser.setScountry(scountry);
	        newUser.setSsports(ssports);
	      
	        IUserService userservice = UserServicefactory.getUserService();
			userservice.saveUser(newUser);
	        
	        System.out.println(newUser);
	        
	        response.sendRedirect("list");
	    }
	    
	    public void listUser(HttpServletRequest request, HttpServletResponse response)
	    	    throws SQLException, IOException, ServletException {
	    	
	    	IUserService userservice = UserServicefactory.getUserService();
	    	        List < Users > listUser = userservice.getAllUser();
	    	        request.setAttribute("listUser", listUser);
	    	        RequestDispatcher dispatcher = request.getRequestDispatcher("list-user.jsp");
	    	        dispatcher.forward(request, response);
	    	    }
	    
	    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
	    	    throws SQLException, IOException {
	    	IUserService userservice = UserServicefactory.getUserService();
	    	        int uid = Integer.parseInt(request.getParameter("uid"));
	    	        userservice.deleteUser(uid);
	    	        response.sendRedirect("list");
	    	    }
	    
	    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
	    	    throws SQLException, ServletException, IOException {
	    	IUserService userservice = UserServicefactory.getUserService();
	    	        int uid = Integer.parseInt(request.getParameter("uid"));
	    	        Users existingUser =  userservice.getUser(uid);
	    	        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
	    	        request.setAttribute("user", existingUser);
	    	        dispatcher.forward(request, response);

	    	    }
	    
	    private void updateUser(HttpServletRequest request, HttpServletResponse response)
	    	    throws SQLException, IOException {
	    	IUserService userservice = UserServicefactory.getUserService();
	    	int uid = Integer.parseInt(request.getParameter("uid"));
	    	 String sname = request.getParameter("sname");
		        String semail = request.getParameter("semail");
		        String scountry = request.getParameter("scountry");
		        String ssports = request.getParameter("ssports");
		        
		        Users newUser = new Users();
		        
		        newUser.setUid(uid);
		        newUser.setSname(sname);
		        newUser.setSemail(semail);
		        newUser.setScountry(scountry);
		        newUser.setSsports(ssports);
		        
		        userservice.updateUser(newUser);
		        
	    	        response.sendRedirect("list");
	    	    }

       
   }


