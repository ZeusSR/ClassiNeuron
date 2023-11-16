package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.Branch;
import in.neuralnet.model.Student;
import in.neuralnet.util.HibernateUtil;

public class InsertMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
	try {
		
		session = HibernateUtil.getSession();

		transaction = session.beginTransaction();


		Branch branch = new Branch();
		branch.setBid("B-111");
		branch.setBname("CS");
		branch.setBlocation("Bengaluru");

		Student s1 = new Student("sachin", "MI", branch);
		Student s2 = new Student("dhoni", "CSK", branch);
		Student s3 = new Student("kohli", "RCB", branch);

		session.save(s1);
		session.save(s2);
		session.save(s3);

			 
			 flag = true;
			 
			 
		 }
		
		 catch (HibernateException  e) {
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
