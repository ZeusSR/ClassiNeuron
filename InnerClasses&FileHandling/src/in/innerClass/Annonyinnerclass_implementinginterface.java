package in.innerClass;

public class Annonyinnerclass_implementinginterface {

	public static void main(String[] args) {

		
//	1	Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//
//				System.out.println("Inside implemented class");
//				
//			}
//			
//		};
		
// 2	Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//
//				System.out.println("Inside implemented class");
//				
//			}
//			
//		});
//		t.start();
		
		 new Thread(new Runnable() {
			
						@Override
						public void run() {
			
							System.out.println("Inside implemented class");
							
						}
						
					}).start();;

		

	}

}
