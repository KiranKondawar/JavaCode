package basic;
/*Palindrome number algorithm
Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"*/

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		int num,rem,temp,sum;
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter  not to be checked");
		num=Sc.nextInt();
		temp=num;
		sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		if(temp==sum)
			System.out.println("NO is palindrome");
		else
			System.out.println("NO is Not Polindrome");
	}

}
