package in.neuralnet.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static Configuration cfg = null;
	static SessionFactory sessionfactory = null;
	static Session session = null;
	
	
	

		
	public static SessionFactory getSessionFactory()
	{
			try {
				cfg = new Configuration();
				cfg.configure();
				
				if(sessionfactory == null)
				sessionfactory = cfg.buildSessionFactory();
				
				
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return sessionfactory;
	}
		
	
	
//	public static Session getSession()
//	{
//		if(session == null)
//			
//			 session =sessionfactory.openSession();
//		return session;
//	}
//	
//	public static void closeSession(Session session)
//	{
//		if(session !=null)
//			
//			session.close();
//	}
	
	public static void closeSessionFactory(SessionFactory sessionfactory)
	{
		if(sessionfactory != null)
			
			sessionfactory.close();
		
	}

}
