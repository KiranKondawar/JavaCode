package LeetCode4;

public class validAnagram {

	public static boolean isAnagram(String s1, String s2) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		s1=s1.replace(" ", "");
		s2=s1.replace(" ", "");

		if (s1.length() != s2.length()) {
			System.out.println("No Anagram");
			return false;
		}
		
		int Counts[]=new int[26];
		
		//fill the count first
		for(int i=0;i<s1.length();i++) {
			Counts[s1.charAt(i)-'a']++;
		}
		
		//blank the counts array
		for(int i=0;i<s1.length();i++) {
			Counts[s1.charAt(i)-'a']--;
		}
		
		//check all values
		for(int count: Counts) {
			if(count != 0) {
				System.out.println("No anagram");
				return false;
			}
		}
		return true;
		
		

	}

	public static void main(String[] args) {
		String s1 = "kiran kondawar";
		String s2 = "nakir warkonda";

		boolean str=isAnagram(s1, s2);
		System.out.println(str);
	}

}
