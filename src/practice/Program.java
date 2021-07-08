package practice;

//using single pivot
public class Program{
 public static void quickSort(int[] input, int left, int right) {
     if (left < right) {
         int partitionIndex = partition(input, left, right);
   
         quickSort(input, left, partitionIndex-1);
         quickSort(input, partitionIndex+1, right);
     }
 }
 private static int partition(int[] arr, int left, int right) {
     int pivot = arr[right];
     int i = (left-1);
   
     for (int j = left; j < right; j++) {
         if (arr[j] <= pivot) {
             i++;
   
             swap(arr, i, j);               
         }
     }
     swap(arr, i+1, right);       
   
     return i+1;
 }
  
 public static void swap (int[] arr, int x, int y)
 {
     int temp = arr[x];
     arr[x] = arr[y];
     arr[y] = temp;
 }
  
 public static void print(int[] array) {
     for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
      }
      System.out.println();
   }
 public static void main(String[] args) {
     int[] input = {99,55,66,1,2,5,4,3};
     print(input);
     quickSort(input,0,input.length-1);
     print(input);
 }
}