package Strings;

public class atoi {

	public int StrtoInt(String str) {
		// null and empty
		if (str == null || str.length() == 0)
			return 0;
		// trim spaces
		str = str.trim();
		
		// handle negative numbers
		char flag = ' ';
		int i = 0;
		int result = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		}
		else if (str.charAt(0) == '+') {
			i++;
		}
		
		// Find the value 
		while (i != str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
			result = result * 10 + (str.charAt(i)-'0');
			i++;
		}
		
		// Negative number 
		if (flag == '-')
			result *= -1;
		
		if (result > Integer.MAX_VALUE)
			result = Integer.MAX_VALUE;
		if (result < Integer.MIN_VALUE)
			result = Integer.MIN_VALUE;
		
		return result;
			
	}
	public static void main(String args[]) {
		atoi ai = new atoi();
		String str = "-09737";
		
		System.out.println(ai.StrtoInt(str));
	}
}
