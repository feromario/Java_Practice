package Searching;
import java.util.Scanner;

public class LinearSearch {
    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Array and key to search for
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter the number to be searched: ");
        int target = scan.nextInt();
        // Call linear search method
        int result = linearSearch(arr,target);
        // Print result
        if (result == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index: " + result + ".");
        }

    }

    // Linear search method
    public static int linearSearch(int[] arr, int key) {
        // Iterate array, if key matches, return the index of that element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
