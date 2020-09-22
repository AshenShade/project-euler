package ashenshade.euler;

public class Util {

	public static boolean isAFactor(long limit, long test) {
		if (limit % test == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(long test) {
		
		for(long i = 2L; i <= Math.sqrt(test); i++) {
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
	
}
