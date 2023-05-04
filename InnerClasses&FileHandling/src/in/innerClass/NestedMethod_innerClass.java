package in.innerClass;

class First
{

	class Second
	{
		class Third
		{
			public void m1()
			{
				class sol
				{
					public void sum(int x,int y)
					{
						int c=x+y;
					  System.out.println("The sum is :"+c);
					}
				}
				new sol().sum(10,19);
				new sol().sum(11,29);
				new sol().sum(120,199);
				new sol().sum(1012,119);
			
			}
			
		}
	}
}




public class NestedMethod_innerClass {

	public static void main(String[] args) {

		new First().new Second().new Third().m1();
	}

}
