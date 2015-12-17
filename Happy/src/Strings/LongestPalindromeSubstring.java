package Strings;

public class LongestPalindromeSubstring {
	int lps(String str) {
		int maxlength = 1;
		int oddlength = 1,evenlength = 0;
		int low = 0,high = 0;

		// odd length
		for (int i=1;i<str.length();i++ ) {
			int count = 0;
			low = i-1;
			high = i+1;
			while (high < str.length() && low > 0 && str.charAt(low) == str.charAt(high) ) {
				count++;
				low--;
				high++;
			}
			if (maxlength < count)
				maxlength = count;
			
		}
		oddlength = 2*maxlength+1;
		
		// even length
		maxlength = 0;
		for (int i=1;i<str.length();i++ ) {
			int count = 0;
			if (str.charAt(i) == str.charAt(i-1)) 
			{	
				count++;
				low = i-2;
				high = i+1;
				while (high < str.length() && low > 0 && str.charAt(low) == str.charAt(high) ) {
					count++;
					low--;
					high++;
				}
				if (maxlength < count)
					maxlength = count;
			}
		}
		evenlength = 2*maxlength;
		
		return Math.max(oddlength, evenlength);
	}
public static void main(String args[]) {
	LongestPalindromeSubstring l = new LongestPalindromeSubstring();
	String str = "HiChandananadnahCHi";
	
	System.out.println(l.lps(str));
}
}
