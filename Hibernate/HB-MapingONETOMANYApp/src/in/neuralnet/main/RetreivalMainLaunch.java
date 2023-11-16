package in.neuralnet.main;

import org.hibernate.Session;

import in.neuralnet.model.Employee;
import in.neuralnet.util.HibernateUtil;

public class RetreivalMainLaunch {

	public static void main(String[] args) {

		Session session = null;
		
		
		try
		{
			session = HibernateUtil.getSession();
			
			Employee emp = session.get(Employee.class, 1);
			
			System.out.println(emp);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
