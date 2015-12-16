package Strings;

import java.util.Arrays;

public class HasDuplicates {
boolean duplicates(int[] arr,int N) {
	int Narray[] = new int[N];
	Arrays.fill(Narray, 0);
	
	// Maintain a count array. 
	// False = No duplicates
	// True = Duplicates
	for (int i=0;i<arr.length;i++) {
		if (Narray[arr[i]-1] == 0)
			Narray[arr[i]-1]++;
		else return true;
			
	}
	return false;
	
}
public static void main(String args[]) {
	HasDuplicates hd = new HasDuplicates();
	int arr[] = {1,2,3,4,5};
	int N = 5;
	System.out.println(hd.duplicates(arr,N));
}
}
