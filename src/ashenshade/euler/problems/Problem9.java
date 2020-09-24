package ashenshade.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem9 {

	class PythagoreanTriplet{
		
		int a, b, c;
		
		PythagoreanTriplet(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		 int getProduct(){
			 return a * b * c;
		 }
		 
		 int getSum() {
			 return a + b + c;
		 }
		
	}
	
	public static void run() {
	
		// find Pythagorean triplet (a^2 + b^2 = c^2 | a < b < c)
		// where a+b+c = 1000
		// a is therefore limited to < 333
		// a + b is therefore limited to < 665
		
		List<PythagoreanTriplet> trips = new ArrayList<>();
		Problem9 p9 = new Problem9();
		
		for(int a = 1; a < 333; a++) {
			
			for(int b = a+1; a+b < 665; b++) {
				
				double c = Math.sqrt((a*a) + (b*b));
				
				if( c == Math.floor(c) ) {
					// if c is a whole number, then it is a Pythagorean Triplet
					trips.add(p9.new PythagoreanTriplet(a, b, (int)c));
				}
				
			}
			
		}
		
		for(PythagoreanTriplet pt: trips) {
			if(pt.getSum() == 1000) {
				System.out.printf("Problem 9: Product of Pythagorean Triplet %d, %d, %d is %d\n", 
						pt.a, pt.b, pt.c, pt.getProduct());
			}
		}
		
	}
	
}
