package HackerRank;

public class minNoofCharRemovetoMakeAnagram {
	public static int removeChar(String s1,String s2) {
		
		int count=0;
		
		int arr[]=new int [26];
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		for(int i=0;i<s1.length();i++) {
			arr[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s2.length();i++) {
			arr[s2.charAt(i)-'a']--;
		}
		
		for(int a: arr) {
			count+=Math.abs(a);
		}
		
		return count;
	}

	public static void main(String[] args) {
		String s1="kiran";
		String s2="hran";
		
		int a=removeChar(s1,s2);
		System.out.println("min no of "+ a+ " required to remove");
	}

}
