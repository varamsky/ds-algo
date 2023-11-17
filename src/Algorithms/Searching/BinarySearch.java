package Algorithms.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5}; // make sure the array is sorted for Binary Search

        /*
        0 1 2 3 4
        1 2 3 4 5

        searchValue = 5

        min = 0
        max = 4
        mid = 0 + (4-0)/2 = 0 + 4/2 = 0 + 2 = 2
        array[mid] = array[2] = 3
        (array[mid] < searchValue) => (array[2] < 5) => 3 < 5
        min = mid + 1 = 2 + 1 = 3

        min = 3
        max = 4
        mid = 3 + (4-3)/2 = 3 + 1/2 = 3 + 0 = 3
        array[mid] = array[3] = 3
        (array[mid] < searchValue) => (array[3] < 5) => 4 < 5
        min = mid + 1 = 3 + 1 = 4

        min = 4
        max = 4
        mid = 4 + (4-4)/2 = 4 + 0/2 = 4 + 0 = 4
        array[mid] = array[4] = 5
        (array[mid] == searchValue) => (array[4] == 5) => (5 == 5) => TRUE => FOUND
         */
        System.out.println(binarySearch(array, 5)); // returns true


        /*
        0 1 2 3 4
        1 2 3 4 5

        searchValue = 0

        min = 0
        max = 4
        mid = 0 + (4-0)/2 = 0 + 4/2 = 0 + 2 = 2
        array[mid] = array[2] = 3
        (array[mid] > searchValue) => (array[2] > 0) => 3 > 0
        max = mid - 1 = 2 - 1 = 1

        min = 0
        max = 1
        mid = min + (max - min) / 2 = 0 + (1-0)/2 = 0 + 1/2 = 0 + 0 = 0
        array[mid] = array[0] = 1
        (array[mid] > searchValue) => (array[0] > 0) => 1 > 0
        max = mid - 1 = 0 - 1 = -1

        (min <= max) => (0 <= -1) => FALSE => NOT FOUND
         */
        System.out.println(binarySearch(array, 0)); // returns false
    }

    private static boolean binarySearch(int[] array, int searchValue) {
        int min = 0, max = array.length - 1, mid;


        while (min <= max) {
            /*
            mid = min + (max - min) / 2; VS mid = (min + max) / 2;
            both are exactly same and simplify down to mid = (min + max) / 2;
            but, when using very large arrays, the (min + max) value might exceed the MAX_INT value
            that is why we work around that with the other expression.
             */
            mid = min + (max - min) / 2;
//            mid = (min + max) / 2;
            if (array[mid] == searchValue)
                return true;
            else if (array[mid] < searchValue) {
                min = mid + 1;
            } else max = mid - 1;
        }
        return false;
    }
}
