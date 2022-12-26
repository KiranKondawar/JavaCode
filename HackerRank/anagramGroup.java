package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagramGroup {
	//creating frequencysting as "a2b1"
	public static String createFrequencyString(String str) {
		// here we are take array of size 26 as total char 26 
		int [] freq=new int[26];
 		
		//iterate over each character
		for(char c: str.toCharArray()) {
			freq[c-'a']++;
		}
		
		//start creating the frequency string
		StringBuilder sb=new StringBuilder("");
		char c='a';
		for(int i: freq) {
		sb.append(c);
		sb.append(i);
		c++;
		}
		
		return sb.toString();
	}
	
	public static List<List<String>> isAnagramGroup(String [] arr){
		if(arr == null || arr.length==0) {
			return new ArrayList<>();
		}
		// make amp of string and list of related strings
		Map<String,List<String>> frequencyStringMap=new HashMap<>();
		
		for(String str: arr) {
			// for each string creating same frequencySting
			String frequencyString=createFrequencyString(str);
		
			//if in map that string available just add str in list as value
			if(frequencyStringMap.containsKey(frequencyString)) {
				frequencyStringMap.get(frequencyString).add(str);
			}
			
			// if its not availabke in list then just make a list and add string in that list
			else {
				
				List<String> strList=new ArrayList<>();
				strList.add(str);
				frequencyStringMap.put(frequencyString, strList);
			}
		
		}
		
		// returning group of list as value for each key
		return new ArrayList(frequencyStringMap.values());
	} 

	public static void main(String[] args) {
		//take all set of string
		String arr[]= {"aab","aba","baa","abbccc"};
		System.out.println(isAnagramGroup(arr));

	}

}
