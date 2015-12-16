package Strings;

import java.util.Scanner;

public class ReverseWords {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	String[] str2 = str.split(" ");
	for (int i=0;i<str2.length;i++) {
		char[] c = str2[i].toCharArray();
		for(int j=0,k=str2[i].length()-1;j<str2[i].length()/2;j++,k--) {
			char temp;
			temp = c[j];
			c[j] = c[k];
			c[k] = temp;
			
		}
		System.out.print(new String(c)+" ");
	}

	sc.close();
}
}
