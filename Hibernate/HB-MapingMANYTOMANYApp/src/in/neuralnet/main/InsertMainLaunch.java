package in.neuralnet.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.CollegeStudent;
import in.neuralnet.model.CourseStudent;
import in.neuralnet.util.HibernateUtil;

public class InsertMainLaunch {

	public static void main(String[] args) {
		

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
	try {
		
		session = HibernateUtil.getSession();

		transaction = session.beginTransaction();

        CourseStudent course1 = new CourseStudent("CS-01","Networking",90000);
        CourseStudent course2 = new CourseStudent("CS-02","AI/ML",95000);
        CourseStudent course3 = new CourseStudent("CS-03","Product Development",125000);
        
        Set<CourseStudent> set1 = new HashSet<CourseStudent>();
        set1.add(course1);
        set1.add(course2);
        set1.add(course3);
        
        Set<CourseStudent> set2 = new HashSet<CourseStudent>();
        set2.add(course1);
        set2.add(course2);
        
        Set<CourseStudent> set3 = new HashSet<CourseStudent>();
        set3.add(course3);
        
        
	

		CollegeStudent s1 = new CollegeStudent("Rahul","Lucknow",set1);
		CollegeStudent s2 = new CollegeStudent("Risabh","Delhi",set2);
		CollegeStudent s3 = new CollegeStudent("Akash","Odisha",set1);
		CollegeStudent s4 = new CollegeStudent("Temba","Africa",set3);

		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);


			 
			 flag = true;
			 
			 
		 }
		
		 catch (HibernateException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		
		if(flag == true)
		{
			transaction.commit();
			System.out.println("Object Saved Successfully....");
		}
		else
		{
			transaction.rollback();
			System.out.println("Object Not Saved ....");
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	
	}

}
