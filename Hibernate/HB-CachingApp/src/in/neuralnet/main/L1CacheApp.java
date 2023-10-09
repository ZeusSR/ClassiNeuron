package in.neuralnet.main;

import org.hibernate.Session;

import in.neuralnet.model.Insurance;
import in.neuralnet.util.HibernateUtil;

public class L1CacheApp {

	public static void main(String[] args) {

		Session session = null;
		boolean flag = true;
		Insurance insurance;
		Insurance insurance1;
		
		session = HibernateUtil.getSession();
		
		if(session != null)
		{
           try {
	//			Insurance insurance = new Insurance();
	//			Insurance insurance1 = new Insurance();
				insurance = session.get(Insurance.class, 5L);
				
				System.out.println(insurance);
//				session.evict(insurance);
				insurance1 = session.get(Insurance.class, 5L);
				System.out.println(insurance1);
				System.out.println(insurance.hashCode()+" : "+insurance1.hashCode());
               } catch (Exception e) {
	// TODO Auto-generated catch block
	     e.printStackTrace();
     }
		}
	}

}
