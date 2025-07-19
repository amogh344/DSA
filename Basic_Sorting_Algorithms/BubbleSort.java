package Basic_Sorting_Algorithms;

import java.util.*;

public class BubbleSort {

    public static int[] bubbleSort(int arr[])
    {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j]>arr[j+1]) {
                    
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int sort[] = bubbleSort(arr);

        for (int i : sort) {
            System.out.print(i + " "); 
        }
    }
}