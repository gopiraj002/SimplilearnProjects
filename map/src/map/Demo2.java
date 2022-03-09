package map;

import java.util.Map;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(1,"Arjun");    
	      map.put(2,"Harsha");    
	      map.put(3,"Swapna");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    


	      }

	}
}