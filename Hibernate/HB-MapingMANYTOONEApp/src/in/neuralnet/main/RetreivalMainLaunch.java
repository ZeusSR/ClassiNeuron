package in.neuralnet.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.neuralnet.model.Branch;
import in.neuralnet.model.Student;
import in.neuralnet.util.HibernateUtil;

public class RetreivalMainLaunch {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			Branch branch = session.get(Branch.class, "B-111");
			System.out.println(branch);
			
			
			Student s1 = session.get(Student.class, 1);
			Student s2 = session.get(Student.class, 2);
			Student s3 = session.get(Student.class, 3);
			System.out.println(s1+"\n"+s2+"\n"+s3);


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
