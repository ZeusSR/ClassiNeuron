package in.neuralnet.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.Person;
import in.neuralnet.util.HibernateUtil;

public class SaveOperationDateApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = true;
		
		session = HibernateUtil.getSession();
		
		if(session != null)
		{
			transaction = session.beginTransaction();
			
			try {
				if(transaction != null)
				{
					Person person = new Person();
					person.setPname("Rahul");
					person.setPaddress("Lucknow");
					person.setDob(LocalDate.of(1990, 9, 21));
					person.setDom(LocalDateTime.of(1998, 7, 31, 22, 55));
					person.setDoj(LocalTime.of(20, 15));
					session.saveOrUpdate(person);
				   
					flag = true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
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
