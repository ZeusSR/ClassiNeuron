package in.neuralnet.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.neuralnet.model.Jobseeker;
import in.neuralnet.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Long id = 1l;
		Jobseeker seeker;
		FileOutputStream fos;
		FileWriter out;
		
		try
		{
			if(session !=null)
			{
				seeker = session.get(Jobseeker.class, id);
			    if(seeker !=null)
			    {
				  System.out.println(seeker);
				  
				  fos = new FileOutputStream("store/photo.jpg");
				  fos.write(seeker.getByt_photo());
				  
				  out = new FileWriter("store/resume.txt");
				  out.write(seeker.getChar_resume());
				  
				  
				  fos.flush();
				  out.flush();
				  
				  
				  
			    }
			    else
			    {
			    	System.out.println("Not found");
			    }
		    }	
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
