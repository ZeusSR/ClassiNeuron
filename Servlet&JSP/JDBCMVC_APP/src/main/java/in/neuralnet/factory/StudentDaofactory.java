package in.neuralnet.factory;

import in.neuralnet.dao.IStudentDao;
import in.neuralnet.dao.StudentDaoImpl;


public class StudentDaofactory {

	private static IStudentDao studentdaoimpl;
	
	private StudentDaofactory() {
		
	}
	
   public static IStudentDao getStudentDao()
   {
	   if(studentdaoimpl == null)
		   
		   studentdaoimpl = new StudentDaoImpl();
	   return studentdaoimpl;
		   
   }
	
}
