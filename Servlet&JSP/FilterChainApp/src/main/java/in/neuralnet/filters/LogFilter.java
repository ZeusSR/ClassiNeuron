package in.neuralnet.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@WebFilter("/test")
public class LogFilter extends HttpFilter implements Filter {
       
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FilterConfig fConfig;

	static {
		
		System.out.println("Log Filter loading");
	}
    public LogFilter() {

    	System.out.println("Log Filter instantiation");
    }


	public void destroy() {
		
		fConfig=null;
		System.out.println("Log Filter De-instantiation");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// Request pre-processing logic
		
		PrintWriter out = response.getWriter();
		out.println("<h1>This line is added by the Log filter before processing the request</h1>");
		
		ServletContext context = fConfig.getServletContext();
		HttpServletRequest req1 = (HttpServletRequest)request;
		System.out.println(fConfig);
		
		context.log("A request is coming from"+req1.getRemoteAddr()+"for URL"+req1.getRequestURI()+ " at date  :: " + new Date());

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		out.println("<h1>This line is added by Log filter after processing the request....</h1>");
	}

	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("Log Filter initalization");
		
		this.fConfig = fConfig;
	}

}
