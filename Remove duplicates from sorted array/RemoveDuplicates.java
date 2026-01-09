public class RemoveDuplicates{
	public static int removeDuplicates(int[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 3, 3};
		int length = removeDuplicates(arr);
		System.out.println("Array after removing duplicates is : ");
		for (int k = 0; k < length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}

//Time Complexity: O(n)
//Space Complexity: O(1)
