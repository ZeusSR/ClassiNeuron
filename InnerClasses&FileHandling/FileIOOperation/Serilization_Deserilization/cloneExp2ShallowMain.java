package Serilization_Deserilization;
 class test1
 {
	 int i;

	public test1(int i) {
		super();
		this.i = i;
	}
 }

 class test implements Cloneable
{
	Double c=(double) 44 ;
	test1 e ;


	public test(Double c, test1 e) {
		super();
		this.c = c;
		this.e = e;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
	
}

public class cloneExp2ShallowMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		test1 s = new test1(10);
		test t = new test(45.32,s);
		test a =  (test) t.clone();
		
		a.c= 99.99;
		a.e.i=2000;
		System.out.println(a.c+"  "+a.e.i); 
		System.out.println(t.c+"  "+t.e.i);
		
	}

}
