package Searching;

public class BinarySearch {
    // main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;

        int result = binarySearch(arr, target);
        System.out.println("Key found at index: " + result + ".");
    }

    // binary search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            }  else if (key < arr[mid]) {
                high = mid - 1;
            }  else {
                low = mid + 1;
            }
        }
        return -1;

    }


}
