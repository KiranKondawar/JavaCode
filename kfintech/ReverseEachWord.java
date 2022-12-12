package kfintech;

import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWord {
	
	public static void revString(String str) {
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}
			else {
				while(st.empty() == false) {
					System.out.print(st.pop());
				}
				 System.out.print(" ");
			}
		}	
	while(st.empty()== false) {
		System.out.print(st.pop());
	}	
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		revString(str);
		//System.out.println(str);

	}

}
