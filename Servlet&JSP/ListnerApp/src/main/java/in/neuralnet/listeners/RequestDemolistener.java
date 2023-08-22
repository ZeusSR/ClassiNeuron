package in.neuralnet.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestDemolistener
 *
 */
@WebListener
public class RequestDemolistener implements ServletRequestListener {

	public static int count = 0;

  
    public RequestDemolistener() {
       System.out.println("Hey");
    }


    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Request object destroyed:: " + new java.util.Date());
    }


    public void requestInitialized(ServletRequestEvent sre)  { 
    	count++;
		System.out.println("Request Object got created at :: " + new java.util.Date());
		System.out.println("No of hit for this webapplication is :: " + count);
    }
	
}
