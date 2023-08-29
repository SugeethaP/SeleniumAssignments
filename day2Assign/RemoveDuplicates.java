package week4.day2Assign;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String Name = "PayPal India";
    	char[] charArray = Name.toCharArray();
    	Set<Character> Charset = new LinkedHashSet<Character>();
    	Set<Character> dupCharSet = new LinkedHashSet<Character>();
    	for (Character character : charArray) {
    		boolean add = Charset.add(character);
    		
    		if(add==false)
    		{
    			dupCharSet.add(character);
    		}
			
		}
    	dupCharSet.removeAll(Charset);
    	
    	for (Character character : Charset) {
    		
    		if(character ==' ')
    		{
    			System.out.println(Charset);
    			}
			
		}
	}

}
