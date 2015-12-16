package Strings;

import java.util.Scanner;

public class ReverseWords {
	public static String reverse(String str) {
		char[] c = str.toCharArray();
		for(int j=0,k=str.length()-1;j<str.length()/2;j++,k--) {
			char temp;
			temp = c[j];
			c[j] = c[k];
			c[k] = temp;
			
		}
		return new String(c);
	}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	String[] str2 = str.split(" ");
	String s = "";
	for (int i=0;i<str2.length;i++) {
		s += " "+reverse(str2[i]);
	}
	System.out.println(reverse(s));
	sc.close();
}
}
