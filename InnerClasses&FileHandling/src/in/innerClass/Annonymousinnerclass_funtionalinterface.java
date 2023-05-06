package in.innerClass;

public class Annonymousinnerclass_funtionalinterface {

	public static void main(String[] args) {

//			Runnable r = ()->System.out.println("Inside implemented class");
	
//			Thread t = new Thread(()->System.out.println("Inside implemented class"));
//			t.start();
		
		new Thread(()->System.out.println("Inside implemented class")).start();;
	}

}
