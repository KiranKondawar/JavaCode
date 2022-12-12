package basic;

import java.util.Scanner;

public class stringLength {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter Sting");
		String str=Sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
			count++;
			}
		}
		System.out.println("Count"+ count);
		
	}

}
