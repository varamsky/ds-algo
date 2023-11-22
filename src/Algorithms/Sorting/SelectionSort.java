package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{18, 2, 1, 5, 0, 11};

        System.out.println("Before Selection Sort");
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println("After Selection Sort");
        System.out.println(Arrays.toString(array));
    }

    /*
    Time Complexity: O(n^2)

    - Here in every iteration we find the smallest element and swap it at the starting side(left) of the array
    - Only one swap for every iteration instead of multiple swaps as in case of Bubble Sort

- We assume that the first item is already sorted then, we SELECT the smallest element out of the remaining items.
    - If the unsorted element is smaller than the assumed sorted card then we swap them.
    - In the same way, other unsorted elements are placed in their right place.

    - So at all times we mentally divide the array into 2 parts.
    - Left part:
        - Move all the smaller items into this part.
        - This part is sorted at all times.
        - This part increases in size with every iteration.
    - Right part:
        - This part is unsorted at all times.
        - This part decreases in size with every iteration.
     */
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = i; // assuming the leftmost element to be smallest
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexOfSmallest] > array[j])
                    indexOfSmallest = j; // comparing the current smallest element with others to find the actual smallest element
            }
            // finally swapping and placing the current smallest element in the left part
            int temp = array[indexOfSmallest];
            array[indexOfSmallest] = array[i];
            array[i] = temp;
        }
    }
}
