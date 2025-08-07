public class BubbleSortRecursive {
    
    static void bubbleSort(int[] arr, int n) {
        // Base case: 1 element means already sorted
        if (n == 1) return;

        // One full pass to push the largest element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap if adjacent elements are in wrong order
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recur for remaining array of size n-1
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr, arr.length);
        for (int num : arr) System.out.print(num + " ");
    }
}
