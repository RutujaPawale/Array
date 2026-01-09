public class SecondSmallest{
	public static int secondSmallestElement(int[] arr) {
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if (arr[i] > smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		int arr[] = {6, 7, 4, 1, 2, 5};
		int result = secondSmallestElement(arr);
		System.out.println("Second smallest element in the array is : " + result);
	}
}

//Time Complexity: O(n)
//Space Complexity: O(1)
