import java.util.HashMap;

public class Countingfreq {
    public static void main(String[] args) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int arr[] = {23, 43, 13, 27, 23, 43, 13, 13};
        for(int i=0; i<arr.length;i++){
int key= arr[i];
            if(frequencyMap.containsKey(key))
            
            {
                int old = frequencyMap.get(key);
                frequencyMap.put(key, old + 1);
            }
            else{
frequencyMap.put(key, 1);
            }
        }
        // Display the frequency of each element
        for (Integer key : frequencyMap.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + frequencyMap.get(key));

        }
        int maxfreq= 0;
        int resultkey = 0;
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxfreq) {
                maxfreq = frequencyMap.get(key);
                resultkey = key;
                
            }
        }
        System.out.println("Maximum Frequency: " + maxfreq + " for element:" + resultkey);



    }
}
