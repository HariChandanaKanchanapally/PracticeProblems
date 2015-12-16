package DP;

import java.util.Scanner;

public class Josephus {
	int jose(int n,int k) {
		// returns 1 if there is only one element left
		if (n == 1)
			return 1;
		
		else
			// look in the rest of the n-1 places 
			// start from jose(n-1,k) index and travel k-1 places
			// Add 1 on each iteration because on every iteration, 
			// we have killed one position
			return ((jose(n-1,k) + k-1)%n) + 1;
	}
public static void main(String args[]) {
	Josephus j = new Josephus();
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int k = sc.nextInt();
	
	System.out.println(j.jose(n,k));
	
	sc.close();
}
}
