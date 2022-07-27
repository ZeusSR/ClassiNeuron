
public class ineuron {

	public void PatternIneuron()
	{
	int n=10;
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<n;j++)
		{
			System.out.print(" ");
			if(i==0||i==(n-1)||j==n/2)
			{
			System.out.print("*");
			}
		 else {
			 System.out.print(" ");
		      }
		}
			for(int k=0;k<n;k++)
			{
				System.out.print(" ");
				if(k==0||k==(n-1)||k==i)
				{
				System.out.print("*");
				}
			 else {
				 System.out.print(" ");
			      }
			}
			for(int l=0;l<n;l++)
			{
				System.out.print(" ");
				if(i==0||i==(n-1)||i==(n-1)/2||l==0)
				{
				System.out.print("*");
				}
			 else {
				 System.out.print(" ");
			      }
			}
			for(int m=0;m<n;m++)
			{
				System.out.print(" ");
				if(m==0&&i<(n-1)||i==(n-1) && m!=0 && m!=(n-1)|| m==(n-1)&&i<(n-1))
				{
				System.out.print("*");
				}
			 else {
				 System.out.print(" ");
			      }
			}
			for(int a=0;a<n;a++)
			{
				System.out.print(" ");
				if(i==0 ||i==(n-1)/2||a==0 || a==(n-1) && i<(n-1)/2 || i-a==2)
				{
				System.out.print("*");
				}
			 else {
				 System.out.print(" ");
			      }
			}
			for(int b=0;b<n;b++)
			{
				System.out.print(" ");
				if(b==0&&i<(n-1) && i>0||i==(n-1) && b!=0 && b!=(n-1)|| b==(n-1)&&i<(n-1)&&i>0||i==0 && b!=0 && b!=(n-1))
				{
				System.out.print("*");
				}
			 else {
				 System.out.print(" ");
			      }
			}
			for(int c=0;c<n;c++)
			{
				System.out.print(" ");
				if(c==0||c==(n-1)||c==i)
				{
				System.out.print("*");
				}
			 else {
				 System.out.print(" ");
			      }
		}
		System.out.println("  ");
	}
}
}
