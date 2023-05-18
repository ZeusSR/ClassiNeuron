package Serilization_Deserilization;

public class cloneExpMainLaunch implements Cloneable {

	int i = 11;
	int j =9;
	
	public static void main(String[] args) throws CloneNotSupportedException {

		cloneExpMainLaunch q = new cloneExpMainLaunch();
		
		cloneExpMainLaunch w = (cloneExpMainLaunch) q.clone();
		
		w.i= 22;
		w.j=34;
		
		System.out.println(q.j+"======>"+q.i);
		System.out.println(w.j+"======>"+w.i);
		
	}

}
