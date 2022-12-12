package kfintech;

public class reverseBySb {
	public static void revString(String str) {
		String []words=str.split("\\s");
		String revWord="";
		for(String s:words) {
			StringBuilder sb = new StringBuilder(s);
		revWord +=sb.reverse().toString()+" ";
				
		}
		System.out.println(revWord);
		
		
		
		
	}

	public static void main(String[] args) {
		String str="i am kiran";
		revString(str);

	}

}
