package String;

public class reverseEach {
	public static String revStr(String a) {
		String revword="";
		String[] b=a.split("\\s");
		for(String w:b) {
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			revword +=sb+" ";
		}
		
		
		return revword;
	}
	public static void main(String[] args) {
		
		String str="i am kiran kondawar";
		String c=revStr(str);
		System.out.println(c.trim());

}
}
