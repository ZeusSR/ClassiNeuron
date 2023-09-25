package in.neuralnet.main;

import org.hibernate.Session;

import in.neuralnet.Model.Employee;
import in.neuralnet.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {

		Employee emp = null;
		Session session = HibernateUtil.getSession();
		
		int id = 99;
		
		 try {
			if(session !=null)
			 {
				 emp = session.load(Employee.class, id);
				 
					 System.out.println(emp);
			 }
		} catch (Exception e) {
			System.out.println("Record not availaible for given id  :"+id);
		}
	}

}
