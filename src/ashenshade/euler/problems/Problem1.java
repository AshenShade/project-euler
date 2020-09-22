package ashenshade.euler.problems;

public class Problem1 {

	public static void run(int limit) {
		// sum integers below limit which are multiples of 3 or 5

		int sum = 0;
		for (int i = 1; i < limit; i++) {

			if (i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			}

		}

		System.out.printf("Problem 1: Sum of Multiples of 3 and 5 below %d is %d\n", limit, sum);
	}

}
