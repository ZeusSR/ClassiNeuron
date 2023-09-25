package in.neuralnet.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.neuralnet.Model.Employee;

public class Test {

	public static void main(String[] args) {

		//1.Create configuration object
		Configuration configuration = new Configuration();
		
		//2.Configure configuration object with hibernate.cfg.xml file
		configuration.configure();
		
		
		//3.Build SessionFactory object using configuration object
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		//4.create session object from SessionFactory object for carrying out operation
		Session session = sessionfactory.openSession();
		
		
		//5. created to begin transaction for session object for non -select operation
		Transaction transaction = session.beginTransaction();

		
		Employee emp = new Employee();
		emp.setEmp_id(4);
		emp.setEmp_name("Axar");
		emp.setEmp_sal(93321.187);
		
		//6.Perform Operation
		Serializable obj = session.save(emp);
		System.out.println(obj);
		
		//7.Perform Transaction
		transaction.commit();
		
		//8.Closing Session object
		session.close();
		
	}

}
