public class Singlenumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
    public static void main(String[] args) {
        Singlenumber singleNumberFinder = new Singlenumber();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Single number in nums1: " + singleNumberFinder.singleNumber(nums1)); // 1
        System.out.println("Single number in nums2: " + singleNumberFinder.singleNumber(nums2)); // 4
        System.out.println("Single number in nums3: " + singleNumberFinder.singleNumber(nums3)); // 1
    }
}
