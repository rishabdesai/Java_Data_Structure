//binary search using recursion
package searching;

public class BinarySearchUsingRecursion {
	
	public static int binarySearchRecursion(int[] arr, int left, int right,int key) {
		if(left >right)
			return -1;
		int mid=(left+right)/2;
		if (arr[mid]==key)
				return mid;
		int index;
				if(key<arr[mid])
					index = binarySearchRecursion(arr, left, mid-1, key);
				else
					index = binarySearchRecursion(arr, mid+1, right, key);
		return index;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int result = binarySearchRecursion(arr, 0, arr.length-1, 5);
		System.out.println(result);

	}

}
