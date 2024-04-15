package DataStructures.Heap;

import java.util.Arrays;

// Max-Heap
public class Heap {
    int MAX_SIZE;
    int[] arr;
    int n = 0;

    Heap(int size) {
        this.MAX_SIZE = size + 1; // assuming that 0-th index will be empty, and we will fill from the 1st index
        this.arr = new int[this.MAX_SIZE];
    }

    // O(log N)
    void insert(int value) {
        // NOTE:- For simplicity, here we don't check for ArrayIndexOutOfException

        // add the new value
        n = n + 1;
        arr[n] = value;

        // now heapify
        int i = n;
        while (i > 1) {
            int parent = (int) Math.floor((double) i / 2);
            if (arr[i] > arr[parent]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;

                i = parent;
            } else break;
        }
    }

    // O(log N)
    int delete() {
        // NOTE:- For simplicity, here we don't check for ArrayIndexOutOfException

        int max = arr[1];
        // delete the root value
        arr[1] = arr[n];
        arr[n] = 0; // 0 denotes that this position is empty
        n = n - 1;
        // now heapify
        int i = 1;
        while (i < n) {
            int left = i * 2;
            int right = (i * 2) + 1;
            int larger = (arr[left] > arr[right]) ? left : right;
            if (arr[i] < arr[larger]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[larger];
                arr[larger] = temp;

                i = larger;
            } else break;
        }
        return max;
    }

    public static void main(String[] args) {
        Heap maxHeap = new Heap(10);

        // insert
        maxHeap.insert(5);
        System.out.println("\nInsert\n" + Arrays.toString(maxHeap.arr));
        maxHeap.insert(20);
        System.out.println(Arrays.toString(maxHeap.arr));
        maxHeap.insert(10);
        System.out.println(Arrays.toString(maxHeap.arr));
        maxHeap.insert(25);
        System.out.println(Arrays.toString(maxHeap.arr));
        maxHeap.insert(15);
        System.out.println(Arrays.toString(maxHeap.arr));

        // delete
        System.out.println("\nDelete\n" + maxHeap.delete());
        System.out.println(Arrays.toString(maxHeap.arr));
        System.out.println(maxHeap.delete());
        System.out.println(Arrays.toString(maxHeap.arr));
        System.out.println(maxHeap.delete());
        System.out.println(Arrays.toString(maxHeap.arr));
        System.out.println(maxHeap.delete());
        System.out.println(Arrays.toString(maxHeap.arr));
        System.out.println(maxHeap.delete());
        System.out.println(Arrays.toString(maxHeap.arr));
    }
}
