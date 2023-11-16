package in.neuralnet.main;




import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.Account;
import in.neuralnet.model.Employee;
import in.neuralnet.util.HibernateUtil;

public class InsertMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
	try {
		
		 session = HibernateUtil.getSession();
		 
		 if(session != null)
		 {
			 transaction = session.beginTransaction();
			 
			 Account acc = new Account();
			 acc.setAccNo("IND1101");
			 acc.setAccName("SBI");
			 acc.setAccType("Saving");
			 
			 
			 Employee emp = new Employee();
			 emp.setEname("IndraSR");
			 emp.setEsal(95000.0f);
			 emp.setEaddress("ODISHA");
			 emp.setAccount(acc);
			 
			 session.save(emp);
			 
			 
			 flag = true;
			 
			 
		 }
		
		
		
	} catch (HibernateException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		
		if(flag == true)
		{
			transaction.commit();
			System.out.println("Object Saved Successfully....");
		}
		else
		{
			transaction.rollback();
			System.out.println("Object Not Saved ....");
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	
	}

}
