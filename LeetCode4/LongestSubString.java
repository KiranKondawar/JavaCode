package LeetCode4;

public class LongestSubString {
	public static String longestPalidromeString (String str) {
		String lps="";
		
		if(str.length()<=1) {
			return "no strigng available";
			
		}
		
		//if(str.length()%2==0) {
			
			for(int i=1;i<str.length();i++) {
				int low=i;
				int high=i;
				
				while(str.charAt(low)==str.charAt(high)) {
					low--;
					high++;
					
					if(low == -1 || high ==str.length()) {
						break;
					}
					String Palidrome=str.substring(low+1,high);
					if(Palidrome.length()> lps.length()) {
						lps=Palidrome;
					}
				//}
			//}
			
		//}else {
			//for(int i=1;i<str.length();i++) {
			 low=i-1;
			 high=i;
			
			while(str.charAt(low)==str.charAt(high)) {
				low--;
				high++;
				
				if(low == -1 || high ==str.length()) {
					break;
				}
				 Palidrome=str.substring(low+1,high);
				if(Palidrome.length()> lps.length()) {
					lps=Palidrome;
				}
			}
			
		}
		}
		return lps;
		
		
	}

	public static void main(String[] args) {
		String str="EBBABAD";
		System.out.println(longestPalidromeString(str));

	}

}
