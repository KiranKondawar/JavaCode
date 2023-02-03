package intouch;

import java.util.Scanner;

public class listOfPrimeNo {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
        int limit=Sc.nextInt();
        for(int a=0;a<limit;a++) {
        	
			if(isprime(a)) {
        		System.out.println(a+" ");
        	}
        }
        
        

}

	private static boolean isprime(int a) {
		
		if(a==0||a==1) {
			return false;
		}
		for(int k=2;k<a;k++) {
			if(a%k==0) {
				return false;
			}
		}
		
		return true;
	}
}
