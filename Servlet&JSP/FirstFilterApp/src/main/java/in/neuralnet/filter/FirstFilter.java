package in.neuralnet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/test")
public class FirstFilter extends HttpFilter implements Filter {
       

	static
	{
		System.out.println("Filter Loading");
	}
    public FirstFilter() {
  
    	
    	System.out.println("Filter Instantiation");
    }


	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("Filter Initialization");
	}
	

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		//Logic For pre-processing the request object
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>This hello from filter before processing request.....</h3>");
		
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		
		//Logic For post-processing the response object
		out.println("<h3>This hello from filter after processing response.....</h3>");
		
	}

public void destroy() {
		
		System.out.println("Filter De-instantiation");
	}



}
