package in.neuralnet.factory;


import in.neuralnet.service.IStudentService;
import in.neuralnet.service.StudentServiceImpl;

public class StudentServicefactory {

	private static IStudentService studentserviceimpl;
	
	private StudentServicefactory() {
		
	}
	
   public static IStudentService getStudentService()
   {
	   if(studentserviceimpl == null)
		   
		   studentserviceimpl = new StudentServiceImpl();
	   return studentserviceimpl;
		   
   }
	
}
