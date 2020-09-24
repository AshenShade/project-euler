package ashenshade.euler.problems;

import java.util.ArrayList;
import java.util.List;

import ashenshade.euler.Util;

public class Problem7 {

	// Find the nth Prime Number
	
	public static void run(int n) {
		
		List<Integer> primes = new ArrayList<>();
		
		for(int i = 2; primes.size() < n; i++) {
			
			if(Util.isPrime(i)) {
				System.out.println("Prime: " + i);
				primes.add(i);
			}
			
		}
		
		System.out.printf("Problem 7: %dth Prime is %d\n", n, primes.get(n-1));
		
	}
	
}
