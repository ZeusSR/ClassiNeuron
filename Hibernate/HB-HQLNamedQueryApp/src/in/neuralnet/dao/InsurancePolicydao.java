package in.neuralnet.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.neuralnet.util.HibernateUtil;

public class InsurancePolicydao implements IInsurancePolicy {

	 private static final String  HQL_STANDARD_QUERY = "INSERT INTO in.neuralnet.model.PremiumInsurance(Policyname,CompanyName,docommencement,version,created_at,updated_at,tenure) SELECT i.Policyname,i.CompanyName,i.docommencement,i.version,i.created_at,i.updated_at,i.tenure FROM in.neuralnet.model.Insurance as i WHERE i.tenure>=:Atenure";
	
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
			
			Query query = session.createQuery(HQL_STANDARD_QUERY);
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
