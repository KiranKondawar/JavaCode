package String;

import java.util.HashMap;

public class Anagram1 {
	
	public static boolean isAnagaram(String a,String b) {
		HashMap<Character,Integer> map=new HashMap<>();
		if(a.length() != b.length()) {
			return false;
		}
		
		for(int i=0;i<a.length();i++) {
			//Adding all elements to map
			if(map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else {
				map.put(a.charAt(i), 1);
			}
		}
		for(int i=0;i<b.length();i++) {
			//Removing all elements from map
			if(map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i), map.get(b.charAt(i))-1);
			}else {
			return false;
			}
		}
			
			
		
		
		
		return true;
	}

	public static void main(String[] args) {
		
		String a="abc cd";
		String b="dcb ca";
		
		System.out.println(isAnagaram(a,b));

	}

}
