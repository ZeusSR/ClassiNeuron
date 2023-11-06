package in.neuralnet.main;




import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import in.neuralnet.model.Insurance;
import in.neuralnet.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		
		try
		{
			Query<Insurance> query = session.createQuery("FROM in.neuralnet.model.Insurance");
			List<Insurance> policies = query.list();
			policies.forEach(policy ->System.out.println(policy));
			
			System.out.println("*********************");
			
			Query<Insurance> query1 = session.createQuery("FROM in.neuralnet.model.Insurance WHERE pid>=:id");
			query1.setParameter("id", 8L);
			List<Insurance> insu = query1.getResultList();
			insu.forEach(System.out::println);
			
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}
}	