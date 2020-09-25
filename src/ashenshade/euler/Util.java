package ashenshade.euler;

import java.util.HashSet;
import java.util.Set;

public class Util {

	public static boolean isAFactor(long limit, long test) {
		if (limit % test == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(long test) {
		
		if(test != 2 && test % 2 == 0) {
			return false;
		}
		
		for(long i = 3L; i <= Math.sqrt(test); i+=2) {
//		for(long i = 3L; i < test/2; i+=2) {

			if(isAFactor(test, i)) {
				return false;
			}
		}
		
		return true;
	}

	public static boolean isPalindrome(long test) {
		
		String number = String.valueOf(test);
		for(int i = 0; i <= number.length()-i; i++) {
			if(number.charAt(i) == number.charAt(number.length()-(i+1))) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static Set<Long> getDivisors(long test) {
		
		Set<Long> divisors = new HashSet<>();
		
		for(long i = 1L; i < Math.sqrt(test); i++) {
			if(test % i == 0) {
				divisors.add(i);
				divisors.add(test/i);
			}
		}
		
		return divisors;
		
	}
	
}
