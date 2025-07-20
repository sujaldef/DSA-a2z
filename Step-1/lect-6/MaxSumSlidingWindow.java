public class MaxSumSlidingWindow {
    //Fixed-size Sliding Window
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        int windowSum = 0;
        int maxSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Max sum of subarray of size " + k + " is: " + maxSum);
    }
}
