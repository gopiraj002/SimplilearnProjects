package map;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Don");    
	      hm.put(2,"Bhai");    
	      hm.put(3,"Ramu");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	}
}
