package Strings;

import java.util.Scanner;

public class StringToInteger {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int isNeg = 0;
	int i = 0,ans = 0;
	int n = str.length()-1;
	
	//check if the number is negative
	if (str.charAt(0) == '-') {
		isNeg = 1;
		i++;
	}
	
	// Take each character's ascii subtract by '0' to get the value of numeric
	// multiply it by 10 power n based on digits position
	// digits taken from left to right, power of 10 decreases from left to right
	while (i != str.length()) {
		if (isNeg != 1)
			ans += (str.charAt(i)-'0')*(Math.pow(10,n));
		else
			ans += (str.charAt(i)-'0')*(Math.pow(10,n-1));
		i++;
		n--;
		
	}
	// If the string has - sign, make the integer negative
	if (isNeg == 1)
			ans = ans*-1;
	
	System.out.println(ans);
	sc.close();
	
}
}
