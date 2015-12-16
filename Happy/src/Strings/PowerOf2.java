package Strings;

public class PowerOf2 {
	boolean pow(int a) {
		if (a == 0) return false;
		if((a & (a-1)) == 0) 
			return true;
		else
			return false;
		}
public static void main(String args[]) {
	PowerOf2 p = new PowerOf2();
	System.out.println(p.pow(128));
}
}
