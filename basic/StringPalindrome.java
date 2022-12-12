package basic;

/*Palindrome number algorithm
Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number" */

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean test() {
		try {
			return true;
		}finally {return false;}
	}
	
	public static void main(String [] args) {
//		String original,rev="";
//		System.out.println("enter String/Number to check");
//		Scanner Sc=new Scanner(System.in);
//		original=Sc.next();
//		int length=original.length();
//		
//		for(int i=length-1;i>=0;i--)
//			rev=rev+original.charAt(i);
//		if(original.equals(rev))
//			System.out.println("Sting is polindrome");
//		else
//			System.out.println("Sting is Not polindrome");
		System.out.println(test());
	
	}

}
