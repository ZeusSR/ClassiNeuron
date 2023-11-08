package in.neuralnet.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

import in.neuralnet.model.Project;
import in.neuralnet.util.HibernateUtil;

public class SelectPaginationMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		
	try {
		session = HibernateUtil.getSession();
		
		Criteria criteria = session.createCriteria(Project.class);
		
		criteria.setFirstResult(2);
		criteria.setMaxResults(2);
		
		
		
		List list = criteria.list();
		
		list.forEach(System.out::println);
		
		
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	
	}

}
