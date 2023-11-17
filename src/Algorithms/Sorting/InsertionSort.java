package Algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{18, 2, 1, 5, 0, 11};

        System.out.println("Before Insertion Sort");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("After Insertion Sort");
        System.out.println(Arrays.toString(array));
    }

    /*
    Time Complexity: O(n^2)

    - SORT CARDS IN OUR HAND AS IN A CARD GAME

    - Similar to Bubble sort
    - Here in every iteration we find the smallest element and move it at the starting side(left) of the array
    - Only one swap for every iteration instead of multiple swaps as in case of Bubble Sort

    - Insertion sort works similarly as we sort cards in our hand in a card game.
    - We assume that the first card is already sorted then, we select an unsorted card.
    - If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left.
    - In the same way, other unsorted cards are taken and put in their right place.

    - So at all times we mentally divide the array into 2 parts.
    - Left part:
        - Move all the smaller items into this part.
        - This part is sorted at all times.
        - This part increases in size with every iteration.
    - Right part:
        - This part is unsorted at all times.
        - This part decreases in size with every iteration.
     */
    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = i; // assuming the leftmost element to be smallest
            for (int j = i; j < array.length; j++) {
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
