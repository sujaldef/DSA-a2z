import java.util.HashMap;
import java.util.Map;
public class Twosum {
     public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // in case no solution found (problem says one exists)
    }
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        Twosum twoSumFinder = new Twosum();
        int[] result = twoSumFinder.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }
    }
}
