package ashenshade.euler.problems;

public class Problem6 {

	// Find the difference between the sum of squares and the square of the sum of the first n natural numbers
	public static void run(int limit) {
		
		int sumOfSquares = 0;
		int sumToBeSquared = 0;
		
		for(int i=1; i <= limit; i++) {
			
			sumOfSquares += Math.pow(i, 2);
			sumToBeSquared += i;
			
		}
		
		int squaredSum = (int)Math.pow(sumToBeSquared, 2);
		System.out.printf("Problem 6: Sum of Squares is %d, Square of Sum is %d, Difference is %d\n", 
				sumOfSquares, squaredSum, (squaredSum - sumOfSquares));
	}
	
}
