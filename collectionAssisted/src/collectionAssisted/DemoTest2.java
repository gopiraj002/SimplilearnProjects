package collectionAssisted;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoTest2 {

	public static void main(String[] args) {
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  


	      }
	}
}
