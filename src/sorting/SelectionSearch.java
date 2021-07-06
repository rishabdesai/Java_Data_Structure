//sorting - arranging data in particular way (ascending or descending)
//selection sort = select one element and compare it with all elements after that.
//O(n2)

package sorting;

public class SelectionSearch {
	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 6, 3, 1, 9 };
		selection(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
