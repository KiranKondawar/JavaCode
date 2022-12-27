package basic;

public class secondLowestElementInArray{
	public static void secondLargest(int arr[]) {
		int n = arr.length;
		int second = Integer.MAX_VALUE;
		;
		int smallest = Integer.MAX_VALUE;

		if (n < 2) {
			System.out.println("Length is not valid");

			return;
		}

		for (int i = 0; i < n; i++) {
			smallest = Math.min(smallest, arr[i]);

		}
		for (int i = 0; i < n; i++) {
			if (arr[i] != smallest) {
				second = Math.min(second, arr[i]);
			}
		}

		if (second == Integer.MAX_VALUE) {
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
