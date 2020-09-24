package ashenshade.euler.problems;

import java.util.ArrayList;
import java.util.List;

import ashenshade.euler.Util;

public class Problem10 {

	
	public static void run(int limit) {
	
		List<Integer> primes = new ArrayList<>();
		long sumOfPrimes = 0;
		
		// calculate the sum of primes less than limit
		for(int i = 2; i < limit; i++) {
			if(Util.isPrime(i)) {
				primes.add(i);
			}
		}
		for(Integer i : primes) {
			sumOfPrimes+=i;
		}
		System.out.printf("Problem10: The sum of prime numbers up to %d is %d\n", limit, sumOfPrimes);
	}
	
}
