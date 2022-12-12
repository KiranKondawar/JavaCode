package interview;

import java.util.Scanner;

public class reverseSting {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter String");
		String str=Sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		int a=Integer.parseInt(rev);
		int b=a+2;
		System.out.println(b);
		Sc.close();		
}
}
