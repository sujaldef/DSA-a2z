public class Hashingtheory {
public static void main(String[] args) {
        int[] hashTable = new int[10]; // Hash table of size 10

        // Sample data
        int[] keys = {23, 43, 13, 27};

        // Insert keys using simple hash function: key % size
        for (int key : keys) {
            int index = key % hashTable.length;
            hashTable[index] = key;
        }

        // Display the hash table
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }
}
//Inserts:

// 23 → 23 % 10 = 3

// 43 → 43 % 10 = 3 (⚠️ will overwrite 23 – shows no collision handling in this simple version)

// 13 → 13 % 10 = 3 (⚠️ again overwrites)

// 27 → 27 % 10 = 7