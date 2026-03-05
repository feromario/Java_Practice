package Sorting;

public class SelectionSort {

    // Sorting method
    public static void selectionSort(int[] arr){
        int n = arr.length;
        // one element is assumed sorted
        for (int i = 0; i < n - 1; i++){
            // find minimum element in unsorted side
            int min = i;
            // iterates every element after i
            for (int j = i + 1; j < n; j++){
                // checks if current element is smaller than our min
                if (arr[j] < arr[min]){
                    // updates minimum
                    min = j;
                }
            }

            // swap the minimum found with the first unsorted element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 77, 34, 92};
        selectionSort(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
