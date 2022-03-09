package map;

import java.util.Hashtable;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(1,"Arjun");  
	      ht.put(2,"Rani");  
	      ht.put(3,"John");  
	      ht.put(4,"Jansi");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	}
}
