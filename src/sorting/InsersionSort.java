package sorting;

public class InsersionSort {

	public static void insertionsort(int[] arr) {
		int i, j, temp;

		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 6,3,9,1,2};
		insertionsort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
