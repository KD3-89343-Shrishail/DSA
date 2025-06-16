package assignment7;

public class Assignment7_Q2 {

	public static void heapify(int arr[], int n, int i) {
		int smallest = i; // Initialize smallest as root
		int left = 2 * i + 1; // left = 2*i + 1
		int right = 2 * i + 2; // right = 2*i + 2

		// If left child is smaller
		if (left < n && arr[left] < arr[smallest])
			smallest = left;

		// If right child is smaller
		if (right < n && arr[right] < arr[smallest])
			smallest = right;

		// If smallest is not root
		if (smallest != i) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, smallest);
		}
	}

	public static void heapSortDescending(int arr[]) {
		int n = arr.length;

		// Build min heap
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract elements
		for (int i = n - 1; i >= 0; i--) {
			// Swap root (smallest) with end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Call heapify on reduced heap
			heapify(arr, i, 0);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7, 20 };

		System.out.println("Original Array:");
		for (int i : arr)
			System.out.print(i + " ");

		heapSortDescending(arr);

		System.out.println("\nSorted array in Descending Order:");
		for (int i : arr)
			System.out.print(i + " ");
	}
}
