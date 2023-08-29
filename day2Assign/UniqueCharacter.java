package week4.day2Assign;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "SUGEETHA";
		char[] charArray = Name.toCharArray();
		Set<Character> UniqueChar = new LinkedHashSet<Character>();		
		for (char string : charArray) {
			boolean Comparison_Value = UniqueChar.add(string);
			
			}
          System.out.println("Print Unique Character only  : "+UniqueChar);
	}

}
