import java.util.*;

public class LongestSubarraySumKfornegative {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1;
        System.out.println(longestSubarray(arr, k)); // Output: 3
    }

    static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) maxLen = i + 1;

            if (firstIndex.containsKey(sum - k))
                maxLen = Math.max(maxLen, i - firstIndex.get(sum - k));

            firstIndex.putIfAbsent(sum, i);
        }
        return maxLen;
    }
}
