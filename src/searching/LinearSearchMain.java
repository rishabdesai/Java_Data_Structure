package searching;

public class LinearSearchMain {

	public static int linearSearch(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]== num)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int ans = linearSearch(arr, 5); 
		System.out.println(ans);
	}

}
