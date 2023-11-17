package Algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4, 5, 6, 1};

        System.out.println("Before Quick Sort");
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("After Quick Sort");
        System.out.println(Arrays.toString(array));
    }

    /*
    Time Complexity:
        Worst Case: O(n^2)
        Average Case: O(n log n)

        Worst case occurs when pivot is always the smallest or the largest element.

        In this sort, every time we divide the array into 2 partitions and the partitions are sorted as individual arrays in the partition() method.
        The pivotIndex provides the partition point for the next iteration.
     */
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    /*
    In every iteration of the partition we choose a pivot element which is usually the last element.
    We then compare it with others and move all the items less than pivot on the left and elements greater than pivot on the right.
    At the end the pivot is placed at the correct position where all smaller elements are on left and greater elements on the right.

    This is repeated for all the partitions.
     */
    private static int partition(int[] array, int low, int high) {
        int i = low - 1;
        int pivot = array[high];

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                ++i;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        ++i;
        int temp = array[high]; // or temp = pivot;
        array[high] = array[i];
        array[i] = temp;

        return i; // pivot index
    }
}
