package Strings;

import java.util.HashMap;
import java.util.Map;

public class Poker {
	int deck(int arr[]) {
		int count = 0;
		/*		for (int i = 0; i<arr.length;i++) {
			if (arr[i]>1 && arr[arr[i]-1] > 0) {
				arr[arr[i]-1] *= -1;
				count++;
			}
		}*/
		
		Map<Integer,Integer> s = new HashMap<Integer,Integer>();
		for (int i=0;i<arr.length;i++) {
			if (!s.containsKey(arr[i])) {
				s.put(arr[i], 1);	
				count++;
			}
			else
				s.put(arr[i],(s.get(arr[i]))+1);
			
		}

		if (count == 2)
		{
			for (Integer i: s.values()) {
				if (i!= null && (i == 2 || i ==3)) {
					count = 6;
					break;
				}
			}
			
		}
		
		if (count == 3) {
			for (Integer i: s.values()) {
				if (i != null && i == 3) {
					count = 7;
					break;
				}
			}
		}
		return count;
	}
public static void main(String args[]) {
	Poker p = new Poker();
	int arr[] = {2,1,3,3,3};
	int opt = p.deck(arr);
	
	switch (opt) {
	case 1: System.out.println("Full House");
			break;
	case 2: System.out.println("Four of a kind");
			break;
	case 3: System.out.println("Two pair");
	        break;
	case 4: System.out.println("Pair");
			break;
	case 5: System.out.println("Nothing");
			break;
	case 6: System.out.println("Pair + Three of a kind");
			break;
	case 7: System.out.println("Three of a kind");
			break;
	
	}
}
}
