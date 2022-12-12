package basic;

import java.util.Scanner;


public class FibonacciRecursion {
	public static int fibonacci(int count) {
		if(count == 0)
			return 0;
		if(count == 1)
			return 1;
		return fibonacci(count - 1) + fibonacci(count - 2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter length");
		int count = sc.nextInt();
		for(int i=0; i< count; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		sc.close();
	}

}