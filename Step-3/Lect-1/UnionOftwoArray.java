import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOftwoArray {

    public static int[] unionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new LinkedHashSet<>(); // Keeps unique elements in insertion order
        
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        
        // Convert Set to int[]
        int[] union = new int[set.size()];
        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 3, 8, 4, 2};
        int[] nums2 = {1, 3, 6, 4, 2};
        
        int[] union = unionOfArrays(nums1, nums2);
        
        System.out.println("Union of the two arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
