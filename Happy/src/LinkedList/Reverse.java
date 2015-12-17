package LinkedList;

public class Reverse {
	public node first;
	public node last;

	Reverse() {
		last = null;
		first = null;
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
	void rev() {
		node before = null,current = first,after = null;
		
		while (current != null) {
			after = current.next;
			current.next = before;
			before = current;
			current = after;		
		}
		first = before;	
		
	}
public static void main(String args[]) {
	Reverse r = new Reverse();
	r.insert(10);		
	r.insert(20);
	r.insert(30);
	r.insert(40);
	r.print();
	r.rev();
	r.print();
}
}
