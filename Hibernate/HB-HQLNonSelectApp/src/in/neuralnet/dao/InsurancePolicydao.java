package in.neuralnet.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.neuralnet.util.HibernateUtil;

public class InsurancePolicydao implements IInsurancePolicy {

	 
	
	@Override
	public Integer transferPremiumPolicies(int maxtenure) {
		
		
		
      
		Session session = null;
		Transaction transaction = null;
		Boolean Flag = false;
		Integer records = 0;
		
		
		try
		{
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			
			Query query = session.createNamedQuery("HQL_INSERT_QUERY");
			query.setParameter("Atenure", maxtenure);
			
			 records  =  query.executeUpdate();
			
			Flag = true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(Flag == true)
			{
				transaction.commit();
				System.out.println("No. of records inserted  : "+records);
			}
			else
			{
				transaction.rollback();
				System.out.println("Not working");
			}
			
			HibernateUtil.closeSession(session);
		}
		
		return records;
	}

}
