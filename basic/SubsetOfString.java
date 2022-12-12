package basic;

import java.util.Scanner;

public class SubsetOfString {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=Sc.next();
		int len=str.length();
		int cap=(len*(len+1))/2;
		int counter=0;
		String [] combArray= new String[cap];
		for(int i=0; i<len;i++) {
			for(int j=i; j<len;j++) {
				combArray[counter]=str.substring(i,j+1);
				counter++;
			}
		}
		for(int i=0;i<combArray.length;i++) {
			System.out.println(combArray[i]+ " ");
		}
Sc.close();
	}

}
