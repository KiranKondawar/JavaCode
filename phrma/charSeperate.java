package phrma;

public class charSeperate {

	public static void main(String[] args) {
		String str="Ki1r2n3";
		str=str.toLowerCase();
		String a="";
		String b="";
		
		for(int k=0;k<str.length();k++) {
			if(str.charAt(k)>96 && str.charAt(k)<123) {
				a+=str.charAt(k);
			}else {
				b+=str.charAt(k);
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

}
