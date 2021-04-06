//binarySearch without recursion

package searching;

public class BinarySearchMain {

	public static int binarySearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (right + left) / 2;
			if (arr[mid] == num)
				return mid;
			if (num < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int result = binarySearch(arr, 2);
		System.out.println(result);
	}

}
