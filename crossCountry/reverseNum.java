package crossCountry;

public class reverseNum {

	public static void main(String[] args) {
		int num1=1234;
		
		reverseNo(num1);
		

	}

	private static void reverseNo(int x) {
		int y=x;
		int z=0;
		
		while(x!=0) {
			z=z*10+x%10;
			x=x/10;
		}
		System.out.println(z);
	}

}
