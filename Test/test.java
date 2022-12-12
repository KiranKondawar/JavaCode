package Test;

public class test {
	public static void main(String[] args) {
		try {
			int a = 100;
			int b = 0;
			int c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}
