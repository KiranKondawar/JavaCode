package crossCountry;

public class StringCalculation {
	

	public static void main(String[] args) {
		String str="3+4";
		
		calculate(str);

	}

	private static void calculate(String str) {
		String op="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='+') op +="\\+";
			if(str.charAt(i)=='-') op +="\\-";
			if(str.charAt(i)=='*') op +="\\*";
			if(str.charAt(i)=='/') op +="\\/";
		}
		
		String[] nums=str.split(op);
		
		int a=Integer.parseInt(nums[0]);
		int b=Integer.parseInt(nums[1]);
		
		if(op.equals("\\+")) System.out.println(a+b);
		if(op.equals("\\-")) System.out.println(a-b);
		if(op.equals("\\*")) System.out.println(a*b);
		if(op.equals("\\/")) System.out.println(a/b);
		
		
	}

}
