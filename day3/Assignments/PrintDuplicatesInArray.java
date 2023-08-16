package day3.Assignments;

import java.util.Arrays;
//import java.util.Iterator;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of Array and its value
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//Sort Array in Ascending Order
		Arrays.sort(arr);
		
		//Print the array using for loop, Array cannot print Directly .Print by using index
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Sorted Numbers are:"+arr[i]);
		}
			//Find the Duplicate Value, i is compared with J		
		for (int i = 0; i < arr.length; i++) {
			
		for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Duplicate Numbers are:"+arr[i]);
				}
				
			}
			
		}
	}

}
