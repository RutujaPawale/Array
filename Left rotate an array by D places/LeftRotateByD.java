public class LeftRotateByD {
	public static void leftRotateByD(int[] arr, int d) {
		int temp[] = new int[d];
		int n = arr.length;

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = n - d; i < n; i++) {
			arr[i] = temp[i - (n - d)];
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 3;

		leftRotateByD(arr, d);

		System.out.println("Array after left rotation by " + d + " places is : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
//Time Complexity: O(n + d)
//Space Complexity: O(d)
