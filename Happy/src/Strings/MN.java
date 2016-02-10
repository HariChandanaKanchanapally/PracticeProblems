package Strings;

public class MN {
	public void minum(String str,int N) {
		int count = 0;
		char arr[] = str.toCharArray();
		int i=0;
		for (int j=i+1;i<arr.length && j<arr.length -1;i++,j++) {
			if (arr[i] >= arr[j] && count != N ) {
				arr[i] = 1000;
				count++;
			}
					
		}

		if (count != N && i == arr.length-2) {
			for (int k = arr.length -1 ; count != N ;k--,count++)
				arr[k] = 1000;
		}
		for (int p=0;p<arr.length;p++) 
			if (arr[p] != 1000)
				System.out.print(arr[p]);
	}
	public static void main(String args[]) {
		
		MN mn = new MN();
		/*
		 * Remove N digits from the number to form a minimum number
		 * Logic: From left to right, if digits are in decreasing order, 
		 * manipulate the most significant number, repeat until all N numbers 
		 * are removed. If they are not in decreasing order remove the last digits
		 * 
		 */
		String str = "12345";
		int N = 2;
		mn.minum(str,N);
	}
}
