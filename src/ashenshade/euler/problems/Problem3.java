package ashenshade.euler.problems;

import ashenshade.euler.Util;

public class Problem3 {

	public static void run(long limit) {
		// Find the largest prime factor of limit
		long maxPrimeFactor = 0L;

		for (long i = 1L; i <= limit / 2; i++) {
			if (!Util.isAFactor(limit, i)) {
				continue;
			} else if(Util.isPrime(i)) {
				maxPrimeFactor = i;
				System.out.println(maxPrimeFactor);
			}
		}

		System.out.printf("Problem 3: Largest prime factor of %d is %d\n", limit, maxPrimeFactor);
	}

}
