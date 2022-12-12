package basic;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);
		int a=0;
		int b=1;
		
		int c;
		System.out.println("The no of digit to be printed");

		int count = sc.nextInt();
		System.out.print(a+ " " + b);
		
		for(int i=2;i<count;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(" " + c);
		}
		sc.close();
	}

}
