package DP;

public class minDescentSum {
	private int minDesc(int[][] arr, int p, int q) {
		// TODO Auto-generated method stub
		
		for(int i=p-1;i>=0;i--) {
			for(int j=1;j<q-1;j++) {
					if(j>0 && arr[i][j] + arr[i+1][j+1] < arr[i][j] + arr[i+1][j-1] ) {
						arr[i][j] = arr[i][j] + arr[i+1][j+1];
						//System.out.println(("i:"+(i)+" j:"+(j)+" "+arr[i][j]));
					}
					if( j>0 && arr[i][j] + arr[i+1][j+1] > arr[i][j] + arr[i+1][j-1] ) {
						arr[i][j] = arr[i][j] + arr[i+1][j-1];
						//System.out.println("i:"+(i)+" j:"+(j)+" "+arr[i][j]);
					}
			}
					
		}
		return arr[0][p];
	}
public static void main(String args[]) {
	int n = 4;
	int p = n-1;
	int q = 2*n - 1;
	int arr[][] = {{0,0,0,2,0,0,0},
				   {0,0,5,0,4,0,0},
				   {0,1,0,4,0,7,0},
				   {8,0,6,0,9,0,6}};
	
	minDescentSum mds = new minDescentSum();
	System.out.println(mds.minDesc(arr,p,q));
	
}


}
