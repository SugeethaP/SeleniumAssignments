package day3.Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] data = {3,2,11,4,6,7};
       
      int Len= data.length;
       
       //Ascending Order Array
        Arrays.sort(data);
        for (int i = 0; i < Len; i++) {
        	
        	//Print Given Value in Ascending Order is as:
        	
        	System.out.println("Ascending OrderValue "+  i  + "  is :"+data[i]);
        			
		}
        //Len from top int len=data.length statement
        System.out.println("SecondHighestValueis:"+data[Len-2]);
	}

}
