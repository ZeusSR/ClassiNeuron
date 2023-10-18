package in.neuralnet.main;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuralnet.model.Jobseeker;
import in.neuralnet.util.HibernateUtil;

public class SaveOperationDateApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		byte[] imagecontent = null;
		char[] resumecontent = null;
		boolean flag = false;
		
		try(FileInputStream fis  = new FileInputStream("vj.jpg"))
		{
			imagecontent = new byte[(int)fis.available()];
			fis.read(imagecontent);
			
			File f = new File("qar.txt");
			try(FileReader fr = new FileReader(f))
			{
				resumecontent = new char[(int)f.length()];
				fr.read(resumecontent);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		session = HibernateUtil.getSession();
		
		if(session != null)
		{
			transaction = session.beginTransaction();
			
			try {
				if(transaction != null)
				{
					Jobseeker jobseeker = new Jobseeker();
					jobseeker.setStr_name("Indra");
					jobseeker.setStr_profile("Full Stack WEB");
					jobseeker.setByt_photo(imagecontent);
					jobseeker.setChar_resume(resumecontent);
					
				
					session.saveOrUpdate(jobseeker);
				   
					flag = true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 finally
			 { 
				 if(flag == true)
				 {
					 transaction.commit();
				 }
				 else
				 {
					 transaction.rollback();
				 }
				 HibernateUtil.closeSession(session);
				 
			 }
			
		}
		
	}

}
