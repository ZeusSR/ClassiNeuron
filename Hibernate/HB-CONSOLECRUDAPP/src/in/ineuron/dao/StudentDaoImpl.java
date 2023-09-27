package in.ineuron.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.dto.Student;
import in.ineuron.util.HibernateUtil;


public class StudentDaoImpl implements IStudentDao {

	Student student = null;
	Session session = null;
	Transaction transaction = null;
	boolean flag = true;
	String status = null;

	@Override
	public String save(Student student) {
		
		session = HibernateUtil.getSession();
    
    
		 if(session !=null)
		 {
			 transaction = session.beginTransaction();
			 {
				 try {
					if(transaction != null)
					 {			 		 
						 session.save(student);
						  flag = true;
					 }
				} catch (HibernateException e) {
					e.printStackTrace();
				}
				 finally
				 { 
					 if(flag == true)
					 {
						 transaction.commit();
						 status = "success";
					 }
					 else
					 {
						 transaction.rollback();
						 status = "failure";
					 }
					 
					 
				 }
			 }
		 }

		 return status;
		
	}

	@Override
	public Student findById(Integer sid) {

		try {
			
			session = HibernateUtil.getSession();
			if(session !=null)
			 {
				  student = session.get(Student.class, sid);
				 System.out.println(sid);
				 
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String updateById(Student student) {
		
		
		 
		 if(session !=null)
		 {
			 
			 transaction = session.beginTransaction();
			 {
				 try {
					if(transaction != null)
					 {
						
						 
						 session.saveOrUpdate(student);
						  flag = true;
					 }
				} catch (HibernateException e) {
					e.printStackTrace();
				}
				 finally
				 { 
					 if(flag == true)
					 {
						 transaction.commit();
						 status = "success";
					 }
					 else
					 {
						 transaction.rollback();
						 status = "failure";
					 }
					
					 
				 }
			 }
		 }

		 return status;
		
	}

	@Override
	public String deleteById(Integer sid) {
		 
		session = HibernateUtil.getSession();
		
		if(session !=null)
		 {
			 transaction = session.beginTransaction();
			 {
				 try {
					if(transaction != null)
					 {
						student = session.get(Student.class, sid);

						 if(student != null)
						 {					
						 session.delete(student);
						  flag = true;
						 }
						 else
						 {
							 flag = false;
						 }
					 }
				} catch (HibernateException e) {
					e.printStackTrace();
				}
				 finally
				 { 
					 if(flag == true)
					 {
						 transaction.commit();
						 status = "success";
					 }
					 else
					 {
						 transaction.rollback();
						 status = "failure";
					 }
					
					 
				 }
			 }
		 }
		
		return status;
	}

}
