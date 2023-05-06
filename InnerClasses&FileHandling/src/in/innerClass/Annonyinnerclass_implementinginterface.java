package in.innerClass;

/*Here we are seeing an example of annonymous inner class with with interface implementation*/
public class Annonyinnerclass_implementinginterface {

	public static void main(String[] args) {

		
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//
//				System.out.println("Inside implemented class");
//				
//			}
//			
//		};
		
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Inside implemented class");
				
			}
			
		});
		t.start();
	}

}
