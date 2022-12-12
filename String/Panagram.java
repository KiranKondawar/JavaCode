package String;

public class Panagram {
	public static boolean isPanagram(String str) {
	str.toLowerCase();
	
	if(str.length()<26) {
		return false;
	}else {
	
	for(char c='a';c<='z';c++) {
		if(str.indexOf(c)<0) {
			return false;
		}
	}
	}
	return true;
}

	public static void main(String[] args) {
		
		
		
		String str="The Quick Brown Fox Jumps Over the lazy Dog";
		System.out.println(isPanagram(str));
	}

}
