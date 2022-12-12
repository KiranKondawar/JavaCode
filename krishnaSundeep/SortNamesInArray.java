package krishnaSundeep;

import java.util.Scanner;

public class SortNamesInArray {

	public static void main(String[] args) {
		int n;
		String temp;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number of name you want to sort");
		n=Sc.nextInt();
		String str[]=new String[n];
		Scanner Sc1=new Scanner(System.in);
		System.out.println("enter all names to sort");
		
		for(int i=0;i<n;i++) {
			str[i]=Sc1.nextLine();
			
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(str[i].compareTo(str[j])>0 ) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(String name:str) {
			System.out.println("Sorted Array"+ " " +name);
		}
		String a="kiran";
		String b="suraj";
		System.out.println(a.compareTo(b));
		
		
		
		

	}

}
