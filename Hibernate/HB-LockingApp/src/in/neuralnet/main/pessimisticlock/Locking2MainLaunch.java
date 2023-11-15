package in.neuralnet.main.pessimisticlock;




import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;


import in.neuralnet.model.Project;
import in.neuralnet.util.HibernateUtil;

public class Locking2MainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
	try {
		
		 session = HibernateUtil.getSession();
		 
		 if(session != null)
		 {
			 transaction = session.beginTransaction();
			 Project p = session.get(Project.class, 1L,LockMode.UPGRADE_NOWAIT);
			 System.out.println(p);
			 
			 
			 
			 p.setCost(100000);
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
			System.out.println("Object Updated....");
		}
		else
		{
			transaction.rollback();
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	
	}

}
