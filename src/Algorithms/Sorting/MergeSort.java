package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4, 5, 6, 1};

        System.out.println("Before Merge Sort");
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("After Merge Sort");
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int l, int r) {
        // it means at least 2 items in the array
        if (l < r) {
            int mid = (l + r) / 2;
//           int mid = r - ((r-l)/2);

            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, r);

            merge(array, l, mid, r);
        }
    }

    private static void merge(int[] array, int l, int mid, int r){
        int tempArraySize = r-l+1;
        int[] temp = new int[tempArraySize]; // temp array to store sorted merge array
        int i = l;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= r){
            if(array[i] < array[j]){
                temp[k] = array[i];
                i++;
            }
            else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = array[i];
            i++;
            k++;
        }
        while(j <= r){
            temp[k] = array[j];
            j++;
            k++;
        }

        // copy sorted temp array to actual array
        for(k=0;k<tempArraySize;k++) array[k+l] = temp[k];
    }
}
