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
    
    - In this, we image a scenario where we have to sort the cards in a card game and INSERT chosen element at it's correct place after shifting others to make space
    - We assume that first element is already sorted
    - We chose an element from the remaining part
    - We move backwards till we find an element smaller than the chosen element OR we exhaust the array and reach the start
    - While we are moving back we keep shifting the elements one-to-the-right and make space in the front so that we can INSERT our chosen element at it's correct place
     */
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // we start from 1 assuming that 0 is already sorted
            int temp = array[i]; // chose an element
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j]; // shifting the bigger elements to the right to make space
                j--;
            }
            array[j + 1] = temp; // finally INSERT the element that we have chosen at the start into it's correct position
        }
    }
}
