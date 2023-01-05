package starPattern;

public class StarPattern7 {

	public static void main(String[] args) {
		int a = 6;
		for (int i = 0; i < a; i++) {
			if (i % 4 == 0) {
				for (int c = 1; c < i; c++) {
					System.out.print("0");

				}

			} else if (i % 2 == 0) {
				for (int k = 1; k <= i; k++) {
					System.out.print("0");

				}
			} else {
				for (int j = 0; j < i; j++) {
					System.out.print("1");
				}
			}
			System.out.println(" ");
		}
	}

}
