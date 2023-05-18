package Serilization_Deserilization;
class test1Z
{
	 int i;

	public test1Z(int i) {
		super();
		this.i = i;
	}
}
class testZ implements Cloneable
{
	Double c=(double) 44 ;
	test1Z e ;


	public testZ(Double c, test1Z e) {
		super();
		this.c = c;
		this.e = e;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {

		test1Z q1 = new test1Z(e.i);
		testZ z1 = new testZ(c,q1);
		return z1;
		
//		return super.clone();
	}
	
	
}
public class cloneExp3DeepMainLaunch {

	public static void main(String[] args) throws CloneNotSupportedException {

		test1Z s = new test1Z(10);
		testZ t = new testZ(45.32,s);
		testZ a =  (testZ) t.clone();
		
		a.c= 99.99;
		a.e.i=2000;
		System.out.println(a.c+"  "+a.e.i); 
		System.out.println(t.c+"  "+t.e.i);
		
	}

}
