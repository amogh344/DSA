package Basic_Sorting_Algorithms;
import java.util.*;
public class SelectionSort {

    public static int[] selectionSort(int arr[])
    {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]) {
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int sort[] = selectionSort(arr);

        for (int i : sort) {
            System.out.print(i + " "); 
        }
    }
}
