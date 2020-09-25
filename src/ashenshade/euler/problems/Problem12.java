package ashenshade.euler.problems;

import ashenshade.euler.Util;

public class Problem12 {

	public static void run(int divisorCount) {
		
		// find the first triangle number with over n divisors
		
		int i = 1;
		long triangleSum = 0;
		
		while(true) {
			
			triangleSum += i;
			if(Util.getDivisors(triangleSum).size() > divisorCount) {
				break;
			}
			
			i++;
		}
		
		System.out.printf("Problem12: The First Triangle Number with over %d divisors is %d\n", divisorCount, triangleSum);
		
	}

}
