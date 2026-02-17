public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        System.out.println("Length of longest subarray: " + longestSubarraySum(arr, k));
    }

    public static int longestSubarraySum(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0;
        int maxLen = 0;

        while (right < arr.length) {
            sum += arr[right]; // expand window

            // shrink window from left if sum > k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // check if current sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }
}
