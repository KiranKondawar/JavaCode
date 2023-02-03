package intouch;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enetr a num");
        int num=Sc.nextInt();//123
        int c=num;
        int count=0;
        while(c !=0) {
        	c=c/10;
        	count++;
        }
        c=num;
        int sum=0;
       // System.out.println(count);
        
        while(num>0) {
        	int a=num%10;
        sum+=	Math.pow(a, count);
        	num=num/10;
        }
        if(sum==c) {
        	System.out.println("No is armstrong");
        }else {
        	System.out.println("No is not armstrong");
        }
        

	}

}
