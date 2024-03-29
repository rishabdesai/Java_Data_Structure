//O(n2)

package sorting;

public class BubbleSort {

	public static void bubbleSorting(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int x = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
			}
		}
	}
	
	public static void bubbleSortImproved(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			boolean flag=false; 
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int x = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
					flag=true;
				}
			}
			if(flag==false) //meaning array is already sorted.
				break;
		}
	}
	public static void main(String[] args) {
		int[] arr = {6,3,9,1,2};
		bubbleSorting(arr);
		for(int i=0; i <arr.length;i++)
			System.out.print(arr[i]+ " ");
	}

}

