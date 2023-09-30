package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.Model.Employee;
import in.neuralnet.util.HibernateUtil;

public class DBRowtoEntityApp_Main {

	public static void main(String[] args) {
		Session session = null;
		 Employee emp = null;
		 session = HibernateUtil.getSession();
		 Integer id = 31;
		 


						  try {
							
							  emp = session.get(Employee.class, id);

							 if(emp != null)
							 {			
								 System.out.println("Before Modification"+emp);
								 
								 System.in.read();
								 
								 session.refresh(emp);
								 System.out.println("Before Modification"+emp);
							 
							 }
							 else
							 {
								 System.out.println("Record not availaible for given id  :"+id);
								 System.exit(0);
							 }
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	
	        }
	
}


