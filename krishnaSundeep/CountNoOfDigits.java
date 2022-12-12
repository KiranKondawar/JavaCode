package krishnaSundeep;

public class CountNoOfDigits {

	public static void main(String[] args) {
		int num=12345;
		int count=0;
		//1 TYPE
//		while(num!=0) {
//			num=num/10;count++;
//		}
		//2TYpe Recursive method
//		
//		int count1=countNo( num);
//		System.out.println(count1);
//3rd method
		System.out.println(String.valueOf(num).length());
	}

//	private static int countNo(int num) {
//		if(num==0) {
//			return 0;
//			}
//		return 1+countNo(num/10);
//	}

}
