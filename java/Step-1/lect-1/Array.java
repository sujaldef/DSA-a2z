import java.util.*;
public class Array {
    public static void main(String[] args) {
        int[] array1= new int[5];
        int[] array= {1,2,3,4,5};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 elements for the array:");
        for(int i=0;i<5;i++){
            array1[i]=sc.nextInt();

        }
        System.out.println("Elements of the array1 are:");
        for(int i=0;i<5;i++){
            System.out.println(array1[i] + " ");
        }
        System.out.println("Elements of the array are:");
        for(int i=0;i<5;i++){
            System.out.println(array[i] + " ");
        }        
        // delete an element from the array
        System.out.println("Enter the index of the element you want to delete:");
        int index =sc.nextInt();
        if(index < 0 || index >= array1.length) {
            System.out.println("Invalid index. Please enter a valid index.");
        } else {
            for(int i = index; i < array1.length - 1; i++) {
                array1[i] = array1[i + 1];
            }
            array1[array1.length - 1] = 0; // Optional: Set the last element to zero
        }
        System.out.println("Array after deletion:");
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
        // search an element in the array
        System.out.println("Enter the element you want to search:");
        int searchElement = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] == searchElement) {
                System.out.println("Element " + searchElement + " found at index " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        // minimum and maximum element in the array
        int min = array1[0];
        int max = array1[0];
        for(int i=0;i<array1.length;i++){
            if(array1[i] < min) {
                min = array1[i];
            }
            if(array1[i] > max) {
                max = array1[i];
            }   
        
        }
            System.out.println("Minimum element in the array is: " + min);
            System.out.println("Maximum element in the array is: " + max);

sc.close();

    }
}
