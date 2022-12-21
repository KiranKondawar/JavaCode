package LeetCode4;

public class firstUniqueCharacter {

	public static void main(String[] args) {
		String str="fourbyfourfrog";
		int index=-1;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();) {
				if(str.charAt(i)!=str.charAt(j)) {
					j++;
					
				}else {
					break;
				}
				
				
			}
			
		}
		System.out.println(index);

	}

}
