package BitOps;

public class Numberof1s {
	int Ones(int bit) {
		int count = 0;
		// Idea: if a a number is a power of 2 then,
		// then the number has only one 1, 'and'ing the number 
		// & its previous is zero in one run. Similarly in every iteration,
		// we remove one by 'and'ing.
		while (bit  != 0) {
			bit = (bit & (bit-1));
			count++;
		}
		return count;
	}
public static void main(String args[]) {
	Numberof1s n = new Numberof1s();
	int bit = 10;
	System.out.println(n.Ones(bit));
}
}
