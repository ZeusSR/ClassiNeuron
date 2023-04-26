package in.Generics;


	
	class Gen<T> //User-defined generic class
	{
		T obj;

		public Gen(T obj) {

			this.obj = obj;
		}
		
		public void show()
		{
			System.out.println("The type of object is:"+obj.getClass().getName());
			
		}
		public T getobj()
		{
			return obj;			
		}
		
	}
	

	
	public class main_class {
	public static void main(String[] args) {

		Gen<Integer> a = new Gen<Integer>(11); 
		
		Gen<String> b = new Gen<String>("qwerty"); 
		a.show();
		System.out.println(a.getobj());
		b.show();
		System.out.println(b.getobj());
		
	}

}
