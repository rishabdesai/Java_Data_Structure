package sorting;

public class QuickSort {
	public static void quickSort(int[] a, int left, int right) {
		// 0. if single element or invalid partition then return -1.
		if (left >= right)
			return;
		// 1. consider left-most element as pivot
		int i = left, j = right, pivot = a[left];
		while (i < j) {
			// 2. from left, find element greater than pivot - ith element
			// (from left, traverse till the element greater than pivot) 
			while (i <= right && a[i] <= pivot)
				i++;
			// 3. from right, find element less or equal to pivot - jth element
			// (from right, traverse till the element less or equal to pivot )
			while (j >= left && a[j] > pivot)
				j--;
			// 4. if i & j not crossed, then swap ith element with jth element
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		} // 5. repeat steps 2-4 until, i & j cross each other
			// 6. swap jth element with pivot=a[left]
		int temp = a[left];
		a[left] = a[j];
		a[j] = temp;
		// 7. apply quick sort to the left partition
		quickSort(a, left, j - 1);
		// 8. apply quick sort to the right partition
		quickSort(a, j + 1, right);
	}

	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 1, 2 };

		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
