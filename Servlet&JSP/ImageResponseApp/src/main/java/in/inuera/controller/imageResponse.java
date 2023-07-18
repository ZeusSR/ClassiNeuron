package in.inuera.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class imageResponse
 */
@WebServlet(urlPatterns={"/image"},loadOnStartup=1)
public class imageResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static
	{
		System.out.println("imageResponse loading");
	}

	public imageResponse()
	{
		System.out.println("imageResponse instantiation");
	}
	
	
	@Override
	public void init() throws ServletException {

		System.out.println("imageResponse initialization");
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("image/jpg");
		
		ServletOutputStream os = response.getOutputStream();
		String path = getServletContext().getRealPath("analytics.png");
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = new byte[(int)file.length()];
		
		fis.read(b);  //Reading & placing the data in the byte array
		
		os.write(b);  //Writing the data to ServletOutputStream from byte array
		os.flush();
		
		fis.close();
		os.close();
		
	}

	@Override
	public void destroy() {

		System.out.println("imageResponse De-instantiation");
	}
}
