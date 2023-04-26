package in.HashMap;

import java.util.*;





public class HashMapLaunch_MainClass {

	public static void main(String[] args) {

	
		HashMap hp = new HashMap();
		HashMap hp1 = new HashMap();
		
		hp.put(21,"zap");
		hp.put(22,"fierce");
		hp.put(23,12);
		
		
		
		hp1.put(222, "Prachand");
		
		hp.putAll(hp1);
		
	
		System.out.println(hp);
		System.out.println(hp.get(22));
		System.out.println(hp.remove(22));
		
		System.out.println(hp.containsKey(22));
		System.out.println(hp.containsValue("zap"));
		
		System.out.println(	hp.keySet());
	    
		System.out.println(	hp.values());
		
		Set o = hp.entrySet();
		
		Iterator itr =  o.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+":"+m.getValue());
			
			if(m.getKey().equals(222))
			{
				m.setValue("westores");
			}
			
		}
		System.out.println(hp);
	
	}

}
