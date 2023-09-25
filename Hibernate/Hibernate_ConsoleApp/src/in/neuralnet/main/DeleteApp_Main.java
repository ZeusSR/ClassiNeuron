package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.Model.Employee;
import in.neuralnet.util.HibernateUtil;

public class DeleteApp_Main {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		 boolean flag = false;
		
		 session = HibernateUtil.getSession();
		 Integer id = 22;
		 
		 if(session !=null)
		 {
			 transaction = session.beginTransaction();
			 {
				 try {
					if(transaction != null)
					 {
						 Employee emp = session.get(Employee.class, id);

						 if(emp != null)
						 {					
						 session.delete(emp);
						  flag = true;
						 }
						 else
						 {
							 System.out.println("Record not availaible for given id  :"+id);
						 }
					 }
				} catch (HibernateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 finally
				 { 
					 if(flag == true)
					 {
						 transaction.commit();
						 System.out.println("Object deleted successfully....!");
					 }
					 else
					 {
						 transaction.rollback();
						 System.out.println("Object deletion Unsuccess");
					 }
					 HibernateUtil.closeSession(session);
					 
				 }
			 }
		 }

		 
	}

}
