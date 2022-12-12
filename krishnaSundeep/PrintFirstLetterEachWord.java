package krishnaSundeep;

public class PrintFirstLetterEachWord {

	public static void main(String[] args) {
		String str = "Kiran Sunitottam Kondawar";

		splitWords(str);

	}

	public static void splitWords(String str) {
          String words[]=str.split(" ");
          for(int i=0;i<words.length;i++) {
        	  String s=words[i];
        	  System.out.println(s.charAt(0));
          }
          
	}
}
