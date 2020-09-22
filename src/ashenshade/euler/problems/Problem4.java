package ashenshade.euler.problems;

import java.util.ArrayList;
import java.util.List;

import ashenshade.euler.Util;

public class Problem4 {

	public static void run(int digits) {
		// find the largest product of two 3-digit numbers which is a palindrome

		List<Integer> palindromes = new ArrayList<>();

		for (int i = (int) Math.pow(10, digits - 1); i < (int) Math.pow(10, digits); i++) {

			for (int j = i; j < (int) Math.pow(10, digits); j++) {
				int product = i * j;
				if (Util.isPalindrome(product)) {
					palindromes.add(product);
				}
			}

		}

		int maxPalindrome = 0;
		for(int i : palindromes) {
			maxPalindrome = Math.max(i, maxPalindrome);
		}
		
		System.out.printf("Problem 4: Max Palindrome product of %d digits is %d\n", digits, maxPalindrome);
	}

}
