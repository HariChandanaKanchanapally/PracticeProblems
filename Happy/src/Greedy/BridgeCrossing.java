package Greedy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BridgeCrossing {
	
private int cross(PriorityQueue<Integer> p) {
	
	int total_time = 0;
	PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
	    public int compare(Integer lhs, Integer rhs) {
	        if (rhs > lhs) return +1;
	        if (rhs < lhs) return -1;
	        return 0;
	    }
	});

	// make a max priority queue 
	Iterator<Integer> it = p.iterator();
	while (it.hasNext()) {
		q.add(it.next());
	}
	
	// Retrieve the first two	
	int min1 = p.poll();
	int min2 = p.poll();
	total_time += min2;

	while (!((p.size() == 2) && (p.contains(min1) && p.contains(min2)) )) {		
		// getting back the min1
		if(!p.contains(min1)) {
			total_time += min1;
			p.add(min1);
		}
		
		//removing the max1,max2 
		if( !q.isEmpty() ) {
			int max1 = q.poll();
			int max2 = q.poll();
			total_time += max1;
			p.remove(max1);
		    p.remove(max2);
		}
		
		// getting back min2 
		if (!p.contains(min2)) {
			total_time += min2;
			p.add(min2);
		}
	}

	total_time += min2;
	return total_time;
		
	}
public static void main(String args[]) {
	
	int n;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of people to cross the bridge");
	n = sc.nextInt();
	
	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
	System.out.println("Enter the times taken by each person");
	for (int i=0;i<n;i++) {
		p.add(sc.nextInt());
	}
	
	
	BridgeCrossing bc = new BridgeCrossing();
	System.out.println(bc.cross(p));
	
	sc.close();
}

}
