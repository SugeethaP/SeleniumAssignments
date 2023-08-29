package week4.day2Assign;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		for (int i : data) {
			System.out.println("Given Value is :"+i);
		}
		
		
		Set<Integer> number =new LinkedHashSet<Integer>();
		
		for (Integer DupNumber : data) {
			
			boolean add = number.add(DupNumber);
			
			if(add==false)
			{
				System.out.println("Duplicate Value in the given set:"+DupNumber);
			}
		}
		
	}

}
