package krishnaSundeep;

public class CountOfVowelAndConsonent {

	public static void main(String[] args) {
		String str="Kiran Kondawar";
		
		int vowelCount=0;
		int consonantCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(isvowel(str.charAt(i))) {
				++vowelCount;
			}else if( str.charAt(i) ==' '){
				System.out.println("hii");
			}else {
				++consonantCount;
			}
		}
		System.out.println("Vowel Count"+vowelCount);
		System.out.println("Consonent Count"+consonantCount);
	}

	private static boolean isvowel(char c) {
		c=Character.toUpperCase(c);
		
		
		return (c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U');
	}

}
