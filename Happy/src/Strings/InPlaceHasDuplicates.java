package Strings;

public class InPlaceHasDuplicates {

private static boolean duplicates(int arr[], int N) {
	// TODO Auto-generated method stub
	// negates the number when the number comes in first
	// returns false if even one number comes again
	for (int i=0;i<arr.length;i++) {
		if(arr[i]>=1 && arr[arr[i]-1] > 0 ) {
			arr[arr[i]-1] *= -1;
		}
		else return true;
	}
	return false;
}

public static void main(String args[]) {
	int arr[] = {1,2,3,4,8,7,5,5};
	int N = 8;
	System.out.println(duplicates(arr,N));
}

}
