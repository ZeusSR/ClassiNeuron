package in.innerClass;

public class Outer {

	
	class Inner
	{
		public void main()
		{
			System.out.println("In inner main");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("In outer main");
		
		Outer outer = new Outer();
		
		Inner in = outer.new Inner();
		in.main();

		
	}

}
