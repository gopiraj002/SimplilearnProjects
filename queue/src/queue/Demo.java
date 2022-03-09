package queue;

import java.util.*;

public class Demo 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("chennai");
        		locationsQueue.add("Andhra Pradesh");
        		locationsQueue.add("Mumbai");
        		locationsQueue.add("Banglore");
        		locationsQueue.add("Hyd");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}
