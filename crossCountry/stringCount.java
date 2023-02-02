package crossCountry;

import java.util.HashMap;

public class stringCount {

	public static void main(String[] args) {
          String name="Kiran";
          count(name);
          
	}

	private static void count(String name) {
		 int n=name.length();
		 HashMap<Character,Integer> m=new HashMap<>();
		 for(int i=0;i<n;i++) {
			 if(!(m.containsKey(name.charAt(i)))){
				 m.put(name.charAt(i), 1);
			 }else {
				 m.put(name.charAt(i), m.get(name.charAt(i))+1);
			 }
		 }
		 System.out.println(m);
		 
		 
		
	}

}
