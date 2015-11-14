package DP;

public class Knapsack {
	public int[][] arr;
	int weights[] = {3,2,1,4,5};
	int benefits[] = {25,20,15,40,50};
	int n = weights.length; //no of weights
	int M = 6; // max capacity
	
	Knapsack() {
		 arr = new int[n+1][M+1];
	}
	/*
	 * Initialize the first row and first column to zeros
	 * From i=1,j=1 start calculating the benefits of selecting 
	 * the stone in the sack
	 * If you select current item, see if you can include the previous items too benefits[i-1]+arr[i-1][j-weights[i-1]
	 * If you can't select the current item due to weight constraints, give the benefit of previous item
	 */
	int[][] knapsack(int k,int w) {
		//first row and first col 0
		for (int i=0;i<arr.length;i++)
			arr[i][0] = 0;
		
		for (int i=0;i<arr[0].length;i++)
			arr[0][i] = 0;
		
		for (int i=1;i<n+1;i++) {
			for (int j=1;j<M+1;j++) {
				if (j-weights[i-1] < 0) //weights and benefits has i-1 because weights and benefits array start at 0 
					arr[i][j] = arr[i-1][j];
				else 
					arr[i][j] = Math.max(arr[i-1][j],benefits[i-1]+arr[i-1][j-weights[i-1]]);
			}
		}
	return arr;
	
	}
public static void main(String args[]) {

	int i = 1,w = 1 ;

	Knapsack k = new Knapsack();
	int res[][] = k.knapsack(i,w);
	
	for(int m=0;m<k.n+1;m++) {
		for(int n=0;n<k.M+1;n++) {
			System.out.print(res[m][n]+" ");
		}
		System.out.println("\n");
	}
}
}
