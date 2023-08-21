package in.neuralnet.filters;

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

/**
 * Servlet Filter implementation class DemoFilter
 */
@WebFilter("/test")
public class DemoFilter extends HttpFilter implements Filter {
       


	private static final long serialVersionUID = 1L;
	
	static {
		
		System.out.println("Demo Filter loading");
	}

	public DemoFilter() {

		System.out.println("Demo Filter instantiation");
    }


	public void destroy() {

		System.out.println("Demo Filter De-instantiation");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		out.println("<h1>This line is added by DemoFilter before processing the request....</h1>");
		
		chain.doFilter(request, response);
		
		out.println("<h1>This line is added by DemoFilter after processing the request....</h1>");
	}


	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("Demo Filter initialization");
	}

}
