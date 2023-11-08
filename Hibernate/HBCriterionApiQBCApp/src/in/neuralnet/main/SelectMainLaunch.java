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

public class SelectMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		
	try {
		session = HibernateUtil.getSession();
		
		Criteria criteria = session.createCriteria(Project.class);
		Criterion cond1 = Restrictions.ge("cost", 22000f);
		Criterion cond2 = Restrictions.le("cost", 32000f);
		criteria.add(cond1);
		criteria.add(cond2);
		
		
		criteria.addOrder(Order.desc("cost"));
		
		
		
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
