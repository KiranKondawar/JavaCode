package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter prime no to check");
		int num=Sc.nextInt();
		int flag=0;
		for(int i=2;i<=num;i++) {
			if(num % i == 0) {
				flag=1;
				break;
			}
				
		}
		
		if(flag == 0)
			System.out.println(num+ "is prime");
		else
			System.out.println(num+ "is not prime");
Sc.close();
	}

}
