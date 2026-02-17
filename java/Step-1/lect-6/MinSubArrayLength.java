public class MinSubArrayLength {
//Variable-size Sliding Window
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int target = 7;

        int start = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        System.out.println("Smallest subarray length: " + minLen);
    }
}
