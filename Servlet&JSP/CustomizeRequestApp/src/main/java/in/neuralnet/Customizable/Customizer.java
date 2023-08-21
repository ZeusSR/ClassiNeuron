package in.neuralnet.Customizable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Customizer extends HttpServletRequestWrapper {

	public Customizer(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getParameter(String name) {
		
		String word_e = super.getParameter(name);
		System.out.println(word_e);
		
		if(word_e.equals("JAVA") || word_e.equals("NextJS") || word_e.equals("SpringBoot") || word_e.equals("ML"))
		{
			return "NeuralNet";
		}
		else
		{
			return word_e;
		}
	}
	
	
	

}
