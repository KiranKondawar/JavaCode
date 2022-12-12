package String;

import java.util.Scanner;

public class NoOfOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Enter the Char");
		String str2=sc.nextLine();
		int lengthinitial=str1.length();
        str1=str1.replace(str2,"");
        int finalLength=str1.length();
        System.out.println("No of accurance"+ (lengthinitial-finalLength));
		
	}

}
