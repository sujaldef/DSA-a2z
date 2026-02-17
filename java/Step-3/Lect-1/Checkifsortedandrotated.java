public class Checkifsortedandrotated {
   public static boolean check(int[] nums) {
        int count = 0; // counter for places where order breaks
        int n = nums.length; // length of array
System.out.println(n);
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n; // for last element, wrap around to index 0 meaning[You compare each element with the next, but you stop before the last one, because i + 1 would go out of bounds. ]
            // so basically its like if i is the last element, then next will be 0

            // if current element > next element, then the sorted order breaks
            if (nums[i] > nums[next]) {
                count++;
            }
        }

        // valid if the break happens at most once (sorted or rotated sorted)
        return count <= 1;
    }

    public static void main(String[] args) {
        // Test cases:
        System.out.println(check(new int[]{3, 4, 5, 1, 2})); // true: rotated sorted
        System.out.println(check(new int[]{2, 1, 3, 4}));     // false: unordered
  
    } 
}
