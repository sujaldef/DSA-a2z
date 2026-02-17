import java.util.*;

public class Functions {

    // Pass by value
    public static int Add(int a, int b) {
        return a + b;
    }

    // Pass by reference
    public static int modify(int[] arr) {
        arr[0] = 100; // Modifying the first element of the array
        return arr[0];
    }

    public static void main(String[] args) {
        // Pass by value
        int a = 5;
        int b = 10;
        int sum = Add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        // Pass by reference
        int[] arr = {1, 2, 3, 4, 5};
        int modifiedValue = modify(arr);
        System.out.println("Modified value: " + modifiedValue);
        System.out.println("Array after modification: " + Arrays.toString(arr));
    }
}
