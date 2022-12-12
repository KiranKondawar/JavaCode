package krishnaSundeep;

public class segregateZeroAtLast {

	public static void rearrange(int[] arr, int[] temp) {
		
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[k] = arr[i];
				k++;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				temp[k] = arr[i];
				k++;
			}
			
		}
	}

	public static void print(int[] temp) {
		for (int i : temp) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { -1, -20, 30, 40, 50, -45 };
		int[] temp = new int[arr.length];
		rearrange(arr, temp);
		print(arr);
		print(temp);

	}

}
