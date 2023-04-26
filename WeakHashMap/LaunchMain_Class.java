package in.WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class LaunchMain_Class {

	public static void main(String[] args) throws InterruptedException {

//		HashMap h = new HashMap();
		WeakHashMap h = new WeakHashMap();
		temp t = new temp();
		h.put(t, "Siu");
		
		System.out.println(h);
		
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(h);
		
		
	}

}
class temp
{

	@Override
	public String toString() {
	return "temp";
	}
	
	public void finalize()
	{
		System.out.println("Cleeeeeeeeeeeean!!!!!!!");
	}

	

	
}