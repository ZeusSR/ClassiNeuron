package in.neuralnet.factory;

import in.neuralnet.dao.IUserDao;
import in.neuralnet.dao.UserDaoImpl;

public class UserDaofactory {

	private static IUserDao userdaoimpl;
	
	private UserDaofactory() {
		
	}
	
   public static IUserDao getStudentDao()
   {
	   if(userdaoimpl == null)
		   
		   userdaoimpl = new UserDaoImpl();
	   return userdaoimpl;
		   
   }
	
}
