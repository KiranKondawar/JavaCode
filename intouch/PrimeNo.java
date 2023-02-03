package intouch;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no  to check");
		int no = sc.nextInt();
		
		boolean flag=false;
		if(no ==0 || no==1) {
			flag=true;
		}
		
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("prime no");
		}else {
			System.out.println("not prime no");
		}

	}

}
