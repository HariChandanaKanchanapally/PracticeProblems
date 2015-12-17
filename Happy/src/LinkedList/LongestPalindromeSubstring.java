package LinkedList;

public class LongestPalindromeSubstring {
	public node first;
	public node last;
	
	public LongestPalindromeSubstring() {
		// TODO Auto-generated constructor stub
		first = null;
		last = null;
	}
	void insert(int num) {
		node n = new node();
		n.data = num;
		n.next = null;
		
		if (first == null) {		
			first = n;
			last = n;
		}
		else {
			last.next = n;
			last = n;			
		}
		
	}
	void print() {
		for (node n = first; n != null; n=n.next) {
			System.out.print(n.data+"->");
		}
		System.out.print("null\n");
	}
	int lps() {
		// traverse to middle of linked list
		node fast,slow;
		for (fast = first,slow = first; fast!=null && fast.next!= null; fast=fast.next.next,slow = slow.next);
		// reverse the second half
		node before = null, current = slow, after = null;
		
		while(current != null) {
			after = current.next;
			current.next = before;
			before = current;
			current = after;		
		}
		node second_first = before;
		// check how much of first half is equal to second half
		int max = 0,count = 0;
		for (node p1 = first, p2 = second_first; p1 != slow || p2 != slow ;p1=p1.next,p2=p2.next) {
			if (p1.data == p2.data) {
				count++;
			}
			else
				count = 0;
			if (max < count) 
				max = count;
				
		}
		return 2*max+1;
	}
	
	public static void main(String args[]) {
		LongestPalindromeSubstring l = new LongestPalindromeSubstring();
		l.insert(10);
		l.insert(9);
		l.insert(11);
		l.insert(9);
		l.insert(12);
		
		l.print();
		
		System.out.println("Maximum length palindrome : "+l.lps());
		
	}
}
