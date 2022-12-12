package String;
import java.util.*;

public class LongestSubstring {

	private static String longestSub(String str) {
		HashSet<Character> set=new HashSet<>();
		String longestOverAll="";
		String longestTillNow="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(set.contains(c)) {
				longestTillNow ="";
				set.clear();
			}
			set.add(c);
			longestTillNow +=c;
			if(longestTillNow.length()>longestOverAll.length()) {
				longestOverAll=longestTillNow;
			}
			
		}
		return longestOverAll;
	}
	
	public static void main(String[] args) {
		String str="abcdab";
		System.out.print(longestSub(str));
	}

}
