package in.neuralnet.main;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.Insurance;
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
					Insurance insurance = new Insurance();
					insurance.setCompanyName("TATA");
					insurance.setPolicyname("Tata AIG");
//					insurance.setDocommencement(LocalDateTime.of(1998, 7, 31, 22, 55));;
				
					session.saveOrUpdate(insurance);
				   
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
