package Serilization_Deserilization;
/*Singleton class example*/
class qwerty
{
	static qwerty q = null;
	private qwerty()
	{}

	public static qwerty getObj()
	{
		
			if(q==null)
			q = new qwerty();
			return q;
		
		
	}
	
	public void  fetchResponse()
	{
		System.out.println(this.getClass().descriptorString());
	}
	
}



public class singleTONEXP_Main {

	public static void main(String[] args) {

		
		qwerty r1 = qwerty.getObj();
		qwerty r2 = qwerty.getObj();
		
		r1.fetchResponse();
		r2.fetchResponse();
		
		System.out.println(r1==r2); 
	}

}
