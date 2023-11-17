package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.neuralnet.model.CollegeStudent;
import in.neuralnet.util.HibernateUtil;

public class RetreivalMainLaunch {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			CollegeStudent s1 = session.get(CollegeStudent.class, 1);
			System.out.println(s1);
			System.out.println();
			
			CollegeStudent s2 = session.get(CollegeStudent.class, 2);
			System.out.println(s2);
			System.out.println();
			
			CollegeStudent s3 = session.get(CollegeStudent.class, 3);
			System.out.println(s3);

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
