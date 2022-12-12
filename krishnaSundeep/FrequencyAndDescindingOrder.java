package krishnaSundeep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class FrequencyAndDescindingOrder {

	public static void main(String[] args) {
		String s="Banana";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			Integer value=map.get(c);
			
			if(value!=null) {
				map.put(c, new Integer (value+1));
			}else {
				map.put(c, 1);
			}
		}
		// for sorting we canot go with map 
		//collection having sort method but its aqpplicable only to list
		//for converting map==>set==>list
		Set<Entry<Character,Integer>> set=map.entrySet();
		ArrayList<Entry<Character,Integer>> list=new ArrayList<Entry<Character,Integer>>(set);
		Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
			@Override
			public int compare(Entry<Character,Integer>o1,Entry<Character,Integer>o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Entry<Character,Integer> entry:list) {
			System.out.println("The Frequency of accurance of"+entry.getKey()+" "+entry.getValue());
		}
		System.out.println(map);
		System.out.println(list);
	}

}
