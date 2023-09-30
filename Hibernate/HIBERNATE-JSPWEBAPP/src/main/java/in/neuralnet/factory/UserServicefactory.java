package in.neuralnet.factory;

import in.neuralnet.service.IUserService;
import in.neuralnet.service.UserServiceImpl;

public class UserServicefactory {

	private static IUserService userserviceimpl;
	
	private UserServicefactory() {
		
	}
	
   public static IUserService getUserService()
   {
	   if(userserviceimpl == null)
		   
		   userserviceimpl = new UserServiceImpl();
	   return userserviceimpl;
		   
   }
	
}
