package day2.Assignment;

import java.util.Scanner;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int number = input.nextInt();
		
		if(number<0)
		{
			System.out.println("The Given Number is Negative"+number);
		}
		else
		{
			System.out.println("The Given Number is Positive" +number);
		}
	}

}
