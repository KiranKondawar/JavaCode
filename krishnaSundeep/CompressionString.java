package krishnaSundeep;
import java.util.*;
import java.util.Map.Entry;

public class CompressionString {

	public static void main(String[] args) {
		String str="aabbccddd";
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))!=null) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		StringBuilder sb=new StringBuilder();
		for(Entry<Character,Integer> entry:map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		
		}
		System.out.println(sb.toString());

	}

}
