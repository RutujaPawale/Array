public class MoveZeroesToEnd {
	public static void moveZeroes(int[] arr) {
		int j = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && j == -1) {
				j = i;
			}
			else if (arr[i] != 0 && j != -1) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

		moveZeroes(arr);

		System.out.println("Array after moving all the zeroes to the end is :");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
//Time Complexity: O(n)
//Space Complexity: O(1)
