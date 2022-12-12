package krishnaSundeep;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WordsVowelCount {

	public static void getWordCount(String str) {
		int wordCount = 0;
		int vowelCount = 0;
		int upperCaseCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			switch (c) {
			case ' ':
			case '.':
				wordCount++;
			}

			switch (c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
			}
			if (c >= 65 && c <= 90) {
				upperCaseCount++;
			}
		}
		System.out.println("word count" + wordCount);
		System.out.println("vowel count" + vowelCount);
		System.out.println("Upper count" + upperCaseCount);
	}

	public static void getFrequency(String str) {
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
        Integer c=map.get(str.charAt(i));
       if(map.get(str.charAt(i))==null) {
    	   map.put(str.charAt(i), 1);
       }else {
    	   map.put(str.charAt(i), c++);
       }
		}
		
		for(map.entrySet<Character,Integer> entry: map.EntrySet()) {
			System.out.println("Character"+" " + entry.getKey());
			System.out.println("Frequency"+" " +entry.getValue());
		}

	}

	public static void main(String[] args) {
		String str = "Learn With Krishna Sandeep.";
		getWordCount(str);
		getFrequency(str);

	}

}
