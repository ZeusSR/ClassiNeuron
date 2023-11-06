package in.neuralnet.main;




import java.util.List;
import java.util.Optional;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import in.neuralnet.model.Insurance;
import in.neuralnet.util.HibernateUtil;

public class SelectParticularRecordsColumnApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		try
		{
			Query query = session.createQuery("SELECT pid,Policyname FROM in.neuralnet.model.Insurance");
			List<Object[]> policies = query.getResultList();
			policies.forEach(policiy -> {
					for(Object obj : policiy)
					
						System.out.print(obj+"\t");
						System.out.println();
					});
			
			
			System.out.println("***************************");

			Query query1 = session.createQuery("SELECT Policyname FROM in.neuralnet.model.Insurance");

			List<String> pol = query1.getResultList();
			pol.forEach(val -> System.out.println(val));
			
			System.out.println("***************************");
			
			Query<Insurance> query2 = session.createQuery("FROM in.neuralnet.model.Insurance WHERE pid=:id");
			Long id = 51l;
			query2.setParameter("id",id);
			
			Optional<Insurance> option =   query2.uniqueResultOptional();
			
			if(option.isPresent())
			{
				Insurance insurance = option.get();
				System.out.println(insurance);
			}
			else
			{
				System.out.println("Record Not Found for :"+id);
			}
			
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