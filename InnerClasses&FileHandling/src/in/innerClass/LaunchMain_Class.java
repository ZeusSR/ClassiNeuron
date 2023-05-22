package in.AnonymousInnerClass_ExtendsClass;

interface desk
{
	public void slither();
}
class Nestle
{
	public void taste()
	{
		System.out.println("Spicy");
	}
}

public class LaunchMain_Class {

	public static void main(String[] args) {

		Nestle n = new Nestle() {
			@Override
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		Nestle n1 = new Nestle() {
			@Override
			public void taste()
			{
				System.out.println("Hot 'n' Sweet");
			}
		};
		
		desk d = ()->System.out.println("Slither");
		
		d.slither();
		
		n.taste();
		n1.taste();
		
	}

}
