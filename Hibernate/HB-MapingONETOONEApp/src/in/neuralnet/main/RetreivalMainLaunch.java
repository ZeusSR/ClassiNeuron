package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.neuralnet.model.Department;
import in.neuralnet.model.Employee2;
import in.neuralnet.util.HibernateUtil;

public class RetreivalMainLaunch {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			Department department = session.get(Department.class, "IPL-16");
			Department department2 = session.get(Department.class, "FIFA-23");
			System.out.println(department);
			System.out.println(department2);

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
