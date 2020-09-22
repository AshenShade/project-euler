package ashenshade.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static void run(int limit) {
		// Sum the even elements of the Fibonacci sequence not exceeding limit

		// initialize the series
		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);

		int sum = 0;

		while (fibonacci.get(fibonacci.size() - 1) < limit) {
			// calculate next term
			fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
			
			// add to the running sum if the new term is even
			int i = fibonacci.get(fibonacci.size()-1);
			if(i % 2 == 0) {
				sum += i;
			}
		}

		System.out.printf("Problem 2: Sum of even elements of Fibonacci not exceeding %d is %d\n", limit, sum);

	}

}
