package in.neuralnet.main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

import in.neuralnet.model.Project;
import in.neuralnet.util.HibernateUtil;

public class SelectMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		
	try {
		session = HibernateUtil.getSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Project> cQBC = builder.createQuery(Project.class);
		
		Root<Project> root = cQBC.from(Project.class);
		
		Query<Project> query = session.createQuery(cQBC);
		
		cQBC.select(root);
		
		
		List list = query.list();
		
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
