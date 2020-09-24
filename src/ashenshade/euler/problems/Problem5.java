package ashenshade.euler.problems;

public class Problem5 {
	// Smallest Common Multiple of 1 to n
	public static void run(int limit) {
		
		int test = limit;
		
outer:	while(true) {
			
			for(int i = limit; i > 1; i--) {
				
				if(test % i != 0) {
					test += limit;
					continue outer;
				}
				
			}
			
			System.out.printf("Problem 5: Smallest Common Multiple of 1-to-%d is %d\n", limit, test);
			break;
		}
		
	}
	
}
