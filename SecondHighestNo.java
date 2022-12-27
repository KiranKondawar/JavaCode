package basic;

public class SecondHighestNo {
	public static void secondLargest(int arr[]) {
		int n = arr.length;
		int second = Integer.MIN_VALUE;
		;
		int largest = Integer.MIN_VALUE;

		if (n < 2) {
			System.out.println("Length is not valid");

			return;
		}

		for (int i = 0; i < n; i++) {
			largest = Math.max(largest, arr[i]);

		}
		for (int i = 0; i < n; i++) {
			if (arr[i] != largest) {
				second = Math.max(second, arr[i]);
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("There is no largest element in given Array");
		} else {
			System.out.println("Second Largest element is " + second);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 111, 10, 7, 8 };
		secondLargest(arr);

	}
}
