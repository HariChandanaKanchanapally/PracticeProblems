package Sorts;

import java.util.PriorityQueue;

public class AlmostSorted {
	int[] almost(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int  i;
		for (i=0;i<k;i++) {
			pq.add(arr[i]);	
		}

		int arr2[] = new int[arr.length];
		int j = 0;
		while (i != (arr.length)) {
			 pq.add(arr[i]);
			 i++;
			 arr2[j] = pq.poll();
			 j++;		 
		}
		while (!pq.isEmpty()) {
			arr2[j] = pq.poll();
			j++;
		}

		return arr2;
	}
public static void main(String args[]) {
	AlmostSorted as = new AlmostSorted();
	int k = 3;
	int arr[] = {2, 6, 3, 12, 56, 8};
	int res[] = as.almost(arr,k);
	
	for (int i=0;i<res.length;i++) {
		System.out.println(res[i]);
	}
	
	
}
}
