package intouch;

import java.util.Scanner;

public class A2B3C4 {
	public static String giveString(String str) {
		String finalString="";
		int count=1;
		char c=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(c==str.charAt(i)) {
				count++;
			}else {
				finalString=finalString+c+count;
				count=1;
				c=str.charAt(i);
			}
		}
		
		finalString=finalString+c+count;
		
		return finalString;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		String finale=giveString(str);
		System.out.println(finale);
		
	}

}
