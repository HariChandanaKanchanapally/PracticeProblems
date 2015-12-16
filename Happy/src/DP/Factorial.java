package DP;

public class Factorial {
	public int[] arr;
	
	Factorial(int num) {
		arr = new int[num+1];
		for(int i=0;i<num+1;i++)
			arr[i] = 0;
		
	}
	int fact(int num) {
		if(arr[num] == 0) {
		if(num == 1) 
			arr[num] = num;
		else
			arr[num] = fact(num-1) * num;
		
		}
		return arr[num];
		
	}
public static void main(String args[]) {
	Factorial f = new Factorial(4);
	System.out.println(f.fact(4));
}
}
