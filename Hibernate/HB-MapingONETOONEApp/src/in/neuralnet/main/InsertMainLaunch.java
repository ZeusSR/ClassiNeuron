package in.neuralnet.main;




import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.Department;
import in.neuralnet.model.Employee2;
import in.neuralnet.util.HibernateUtil;

public class InsertMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
	try {
		
		session = HibernateUtil.getSession();

		transaction = session.beginTransaction();

		Employee2 e1 = new Employee2("Messi", 2455.f, "(Inter Miami CF");
		Employee2 e2 = new Employee2("Ronaldo", 2555.f, " Al-Nassr FC");
		Employee2 e3 = new Employee2("Pogba", 5555.f, " Juventus F.C");
		Employee2 e4 = new Employee2("Bale", 1555.f, "Los Angeles FC ");

		Set<Employee2> set = new HashSet<Employee2>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);

		Department dept = new Department();
		dept.setDeptId("FIFA-23");
		dept.setDeptName("Soccer");
		dept.setEmployees(set);

		session.save(dept);

			 
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
