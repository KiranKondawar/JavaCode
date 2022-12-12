package krishnaSundeep;

public class AllPossibleSubstring {

	public static void main(String[] args) {
		String str="Hello";
		int count=0;
		
	for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
				count++;
				
			}
		}System.out.println(count);

	}

}
