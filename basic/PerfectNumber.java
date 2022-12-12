package basic;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 27;
		int res = 0;
		for(int i=1; i<num;i++) {
			if(num%i == 0) {
				res=res+i;
			}
		}
		
		if(num == res) {
			System.out.println("Number is a perfect number");
		}else {
			System.out.println("Number is no1 a perfect number");
		}
	}

}
