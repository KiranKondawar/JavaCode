package String;

public class Anagram {
	public static boolean isAnagarm(String a,String b) {
		
		int [] count=new int [256];
		
		if(a.length() != b.length()) {
			return false;
		}
		
		for(int i=0;i<a.length();i++) {
			count[a.charAt(i)]++;
			count[b.charAt(i)]--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
	String a="abbdsfew";
	String b="babsdfsd";
	
	System.out.println(isAnagarm(a,b));

	}

}
