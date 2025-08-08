public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        // Calculate sum of array elements
        for (int num : nums) {
            sum += num;
        }
        
        // Calculate sum from 0 to n
        int total = n * (n + 1) / 2;
        
        // Missing number is difference
        return total - sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number in nums1: " + missingNumber(nums1)); // 2
        System.out.println("Missing number in nums2: " + missingNumber(nums2)); // 2
        System.out.println("Missing number in nums3: " + missingNumber(nums3)); // 8
    }
}
