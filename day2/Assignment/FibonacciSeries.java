package day2.Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=8,firstNum=0,secNum=1,Sum=0;
		System.out.println(firstNum);
		for (int i = 1; i <=range; i++) {
			Sum = firstNum + secNum;
			firstNum = secNum;
			secNum = Sum;	
			System.out.println(Sum);			
		}
		
	}

}
