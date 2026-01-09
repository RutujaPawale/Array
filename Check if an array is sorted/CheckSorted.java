public class CheckSorted{
	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 5, 8, 9};
		int[] arr2 = {5, 7, 1, 6, 9};

		if (isSorted(arr1)) {
			System.out.println("Array1 is sorted.");
		} else {
			System.out.println("Array1 is not sorted.");
		}
		if (isSorted(arr2)) {
			System.out.println("Array2 is sorted.");
		} else {
			System.out.println("Array2 is not sorted.");
		}
	}
}

//Time Complexity: O(n)
//Space Complexity: O(1)
