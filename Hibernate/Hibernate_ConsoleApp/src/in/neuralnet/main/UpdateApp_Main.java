package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.Model.Employee;
import in.neuralnet.util.HibernateUtil;

public class UpdateApp_Main {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		 boolean flag = true;
		
		 session = HibernateUtil.getSession();
		 
		 if(session !=null)
		 {
			 transaction = session.beginTransaction();
			 {
				 try {
					if(transaction != null)
					 {
						 Employee emp = new Employee();
						 emp.setEmp_id(12);
						 emp.setEmp_name("Rock");
						 emp.setEmp_sal(7677.8);
						 
						 session.saveOrUpdate(emp);
						  flag = true;
					 }
				} catch (HibernateException e) {
					e.printStackTrace();
				}
				 finally
				 { 
					 if(flag == true)
					 {
						 transaction.commit();
					 }
					 else
					 {
						 transaction.rollback();
					 }
					 HibernateUtil.closeSession(session);
					 
				 }
			 }
		 }

		 
	}

}
