package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4, 5, 6, 1};

        System.out.println("Before Bubble Sort");
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After Bubble Sort");
        System.out.println(Arrays.toString(array));
    }

    /*
    Time Complexity: O(n^2)

    - ADJACENT ELEMENTS CHECK AND SWAP

    - We compare each element with its adjacent(next) element
    - If it is not in its correct place we swap
    - Thus, in each step we move the largest element toward its correct position
    - After every pass(every time we traverse the array is called pass) the largest element is placed at its correct position
    - So from the next time we skip the previously sorted element therefore, decreasing the un-sorted array size
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
