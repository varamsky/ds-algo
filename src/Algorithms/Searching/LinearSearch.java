package Algorithms.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(linearSearch(array, 5)); // returns true
        System.out.println(linearSearch(array, 6)); // returns false
    }

    private static boolean linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue)
                return true;
        }
        return false;
    }
}
