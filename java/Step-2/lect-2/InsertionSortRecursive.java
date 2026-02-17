public class InsertionSortRecursive {
    
    static void insertionSort(int[] arr, int n) {
        // Base case: 1 or 0 elements are already sorted
        if (n <= 1) return;

        // Recursively sort the first n-1 elements
        insertionSort(arr, n - 1);

        // Insert the nth element (last one) into its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // Shift elements that are greater than last to the right
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place the last element at its sorted position
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        insertionSort(arr, arr.length);
        for (int num : arr) System.out.print(num + " ");
    }
}
