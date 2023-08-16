package day3.Assignments;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-int[] arr = {1, 2, 4, 5, 6}; // Example array with a missing element
		int[] arr = {1, 2, 4, 5, 6}; // Example array with a missing element
        int n = arr.length + 1; // The total number of elements (including the missing one)
        int sum = (n * (n + 1)) / 2; // Sum of integers from 1 to n
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        int missingElement = sum - actualSum;
        
        System.out.println("The missing element is: " + missingElement);
    }

	}


