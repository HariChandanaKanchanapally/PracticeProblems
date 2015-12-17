package LinkedList;

public class SortedLinkedList {
	public node first,last;
	public SortedLinkedList() {
		// TODO Auto-generated constructor stub
		first = null;
		last = null;
	}
	void sortInsert(int num) {
		node n = new node();
		n.data = num;
		n.next = null;
		if (first == null) {
			first = n;
			last = n;
		} else {
			// insert in the beginning
			if (first.data > num) {
				n.next = first;
				first = n;
			}
			// insert in the end
			if (last.data < num) {
				last.next = n;
				last = n;
			}
			// insert in the middle
			else {
				node temp = first;
				while (num > temp.next.data) {
					temp = temp.next;
					
				}
				node temp2 = temp.next;
				temp.next = n;
				n.next = temp2;
				
			}
				
		}
	}
	void print() {
		for (node n = first; n != null; n=n.next) {
			System.out.print(n.data+"->");
		}
		System.out.print("null\n");
	}
	public static void main(String args[]) {
		SortedLinkedList sll = new SortedLinkedList();
		sll.sortInsert(10);
		sll.sortInsert(5);
		sll.sortInsert(-1);
		sll.sortInsert(17);
		sll.sortInsert(12);
		sll.sortInsert(7);
		sll.sortInsert(0);
		sll.sortInsert(-9);
		sll.print();
	}
}
