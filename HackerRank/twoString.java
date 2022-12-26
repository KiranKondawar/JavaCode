package HackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class twoString {
	public static boolean istwoString(String s1,String s2) {
		
		// as we know set is a collectionwhere repeated letter is not allowed 
		// so use 2 set to add all char in sting
		Set<Character> S1Set=new HashSet<>();
		Set<Character> S2Set=new HashSet<>();
		
		// adding all char from sting s1 to 1st set
		
		for(char c: s1.toCharArray()) {
			S1Set.add(c);
		}
		
		// adding all char from sting s2 to 2nd set
		for(char c: s2.toCharArray()) {
			S2Set.add(c);
		}
		
		// here we are intersecting both set
		// after intersecting we will get char which are commmon in both set
		
		S1Set.retainAll(S2Set);
		
		// now is this s1set is holding common char
		// if it is empty means no common string and we know that NO SUBSTRING so return false
		
		if(!S1Set.isEmpty()) {
			return true;
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		//take 2 input string from user
		System.out.println("Enter 1st string");
		String s1=Sc.next();
		// making both string to lower case to avoid letter case problem
		s1=s1.toLowerCase();
		System.out.println("Enter 2nd string");
		String s2=Sc.next();
		s2=s2.toLowerCase();
		
		//writing a specig=fic method to check the string
		System.out.println(istwoString(s1,s2));

	}

}
