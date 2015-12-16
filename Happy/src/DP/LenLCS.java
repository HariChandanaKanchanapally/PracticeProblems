package DP;

import java.util.Scanner;

public class LenLCS {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	
	int matrix[][] = new int[str1.length()+1][str2.length()+1];
	
	for(int i=0;i<str1.length();i++)
		matrix[i][0] = 0;
	
	for(int i=0;i<str2.length();i++)
		matrix[0][i] = 0;
	
	for(int i=1;i<str1.length()+1;i++) {
		for(int j=1;j<str2.length()+1;j++) {
			if(str1.charAt(i-1) != str2.charAt(j-1)) {
				if(matrix[i][j-1] >matrix[i-1][j])
					matrix[i][j] = matrix[i][j-1];
				else
					matrix[i][j] = matrix[i-1][j];
			}
			else
				matrix[i][j] = matrix[i-1][j-1] + 1;
		}
	}
	System.out.println(matrix[str1.length()][str2.length()]);
	sc.close();
}
}
