
import java.util.*;
// to overcome the overwritingfrom simple hashing, we use chaining
public class SimpleHashingChaining {
    public static void main(String[] args) {
        int bucketSize = 10;
        List<Integer>[] hashTable = new LinkedList[bucketSize];

        // Initialize each bucket to have a linked list 
        for (int i = 0; i < bucketSize; i++) {
            hashTable[i] = new LinkedList<>();
        }

        
        int[] keys = {23, 43, 13, 27};

        // Insert keys
        for (int key : keys) {
            int index = key % bucketSize;
            hashTable[index].add(key);
        }

        // Display the hash table
        for (int i = 0; i < bucketSize; i++) {
            System.out.print("Index " + i + ": ");
            for (int key : hashTable[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }
}
