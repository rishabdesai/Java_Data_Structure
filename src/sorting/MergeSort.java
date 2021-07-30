package sorting;

public class MergeSort {
	public static void mergeSort(int[] arr, int left, int right) {
		//if single element or invalid partition
		if (left >= right)
			return;
		
		// divide array in two equal partitions
		int mid = (left + right) / 2;
		// apply merge sort to left and right partition
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		// create temp array to accommodate both the array
		int[] temp = new int[right - left + 1];
		// merge both sorted array in to temp array
		int i = left;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) 
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		while (i <= mid) 
			temp[k++] = arr[i++];
		while (j <= right) 
			temp[k++] = arr[j++];
		// override temp array to main array
		for (i = 0; i < temp.length; i++) 
			arr[left + i] = temp[i];
	}

	public static void main(String[] args) {
		int[] arr = {6,3,9,1,2};
		mergeSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		}

	}

