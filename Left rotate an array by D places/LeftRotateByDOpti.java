public class LeftRotateByD2 {
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void leftRotateByD2(int[] arr, int d) {
		int n = arr.length;

		d = d % n;

		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int d = 3;

		leftRotateByD2(arr, d);

		System.out.println("Array after left rotation by " + d + " places using reverse method is : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
//Time Complexity: O(2n)
//Space Complexity: O(1)
