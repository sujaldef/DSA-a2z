import java.util.Arrays;

public class maxfreqofelemtregardingk {
     public int maxFrequency(int[] nums, int k) {
      Arrays.sort(nums); 
        long total = 0;    
        int left = 0, maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            //
            while ((long) nums[right] * (right - left + 1) - total > k) {//checks if the k is exceeding or not 
                total -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
    public static void main(String[] args) {
        maxfreqofelemtregardingk obj = new maxfreqofelemtregardingk();
        int[] nums = {1, 2, 4};
        int k = 5;
        int result = obj.maxFrequency(nums, k);
        System.out.println("Maximum frequency of an element with respect to k: " + result);
    }
}
