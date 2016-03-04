/*
 * File: FibinociSequence.java
 * ---------------------------
 */

import acm.program.*;

public class FibinociSequence extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;
	static int term = 0;
	int A = 1;
	int B = 0;
	int C = 0;
	
	public void run() {
		
		println("This program lists the Fibonacci Sequence up to 6765");
		
		while (term < MAX_TERM_VALUE) {
			
			//how to exit the loop
			if (term > MAX_TERM_VALUE) break;
			
			//C equals B value
			C = B;
			
			//outputs the Fibonacci sequence
			println(""+B+"");
			
		
			B = A + B;
			
			//these printlns were used to test the program and see how it was calculating the answers
			//			println("B= "+B+"");
			//			println("A= "+A+"");
			
			
			// A now equals C which is equal to B.  
			//Since C is only equal to B at the start of the loop so A is as well.  
			A = C;
			
			//this println was used to test the program and see how it was calculating the answers
			//			println("AC = "+A+"");
			
			//int term now equals B so when B is greater then MAX_TERM_VALUE 
			//term will be as well and the program will exit the while loop.
			term = B;
			
			}	
	}
}

