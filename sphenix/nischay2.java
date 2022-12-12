package sphenix;

public class nischay2 {

	public static void main(String[] args) {
		int total=0;
		String s="apples 5 1,orange 6 1";
		// String[] ch=s.split(" ");
	
			 String[] str=s.split(",");
			 for(int i=0;i<str.length;i++) {
			 
			 System.out.println(str[0]);
			 String a=str[i];
			 char  x=a.charAt(a.length()-1);
			 char y=a.charAt(a.length()-2);
			 int f=Integer.parseInt(x);
			 int g=Integer.parseInt('x');
			 System.out.println(x*y);
			 }
			// total +=s[s.length()-1]*s[s.length()-2];
			
	}

}
