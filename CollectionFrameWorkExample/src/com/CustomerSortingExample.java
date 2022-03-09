package com;

public class CustomerSortingExample {

	public static void selectionSort(int num[], int size){
		for(int i=0;i<size-1;i++){
			int min =i;
			   for(int j=i+1;j<size;j++){
			    if(num[j]>num[min]){
				   min =j;
			    }
		       }
		
	}

}
